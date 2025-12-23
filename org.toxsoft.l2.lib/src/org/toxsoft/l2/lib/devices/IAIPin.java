package org.toxsoft.l2.lib.devices;

import static org.toxsoft.core.tslib.utils.TsLibUtils.*;

/**
 * Analog inut pin.
 *
 * @author max
 */
public interface IAIPin
    extends IPin {

  /**
   * Stub AI pin with ID {@link #NONE_ID} always returns <code>null</code>.
   */
  IAIPin STUB_AI_PIN = new InternalStubAIPin();

  /**
   * Returns the value of the analog input.
   * <p>
   * Returns <code>null</code> if there was initialization error or device becomes broken.
   *
   * @return {@link Float} - input value or <code>null</code>
   */
  Float getAI();

}

/**
 * {@link IAIPin#STUB_AI_PIN} implementation.
 *
 * @author max
 */
class InternalStubAIPin
    implements IAIPin {

  @Override
  public EPinKind kind() {
    return EPinKind.AI;
  }

  @Override
  public String id() {
    return NONE_ID;
  }

  @Override
  public String nmName() {
    return NONE_ID;
  }

  @Override
  public String description() {
    return EMPTY_STRING;
  }

  @Override
  public Float getAI() {
    return null;
  }

}
