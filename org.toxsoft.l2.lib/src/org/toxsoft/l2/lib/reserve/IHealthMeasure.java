package org.toxsoft.l2.lib.reserve;

import org.toxsoft.core.tslib.math.*;

/**
 * Unit (module, device, any component) "health" quantitative estimation.
 *
 * @author hazard157
 */
public interface IHealthMeasure {

  /**
   * Range of health estimation value.
   * <p>
   * Actually measured in percents where 0 is dead component, 100 - absolutely healthy.
   */
  IntRange HEALTH_RANGE = new IntRange( 0, 100 );

  IntRange WEIGHT_RANGE = new IntRange( 0, 10 );

  /**
   * Returns the health level as a percentage.
   *
   * @return int - health level in range {@link #HEALTH_RANGE}
   */
  default int health() {
    return HEALTH_RANGE.maxValue();
  }

  /**
   * Returns relative contribution to system health.
   *
   * @return int - system health contribution in range {@link #WEIGHT_RANGE}.
   */
  default int weight() {
    return (WEIGHT_RANGE.maxValue() - WEIGHT_RANGE.minValue() + 1) / 2;
  }

}
