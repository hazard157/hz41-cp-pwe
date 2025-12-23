package org.toxsoft.l2.lib.reserve;

/**
 * Mix-in interface for an entity that can evaluate its performance state (health) as an integer percents.
 *
 * @author max
 */
public interface IHealthMeasurable {

  /**
   * Returns the health level as a percentage (0-100).
   *
   * @return int - health level (0-100)
   */
  default int getHealth() {
    return 100;
  }

  /**
   * Returns relative contribution to system health (1-10).
   * <p>
   * Returned value 1 is minimal contribution, 10 - maximal contribution.
   *
   * @return int - system health contribution (1-10)
   */
  default int getWeight() {
    return 5;
  }

}
