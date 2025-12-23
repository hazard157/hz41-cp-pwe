package org.toxsoft.l2.lib.devices;

import static org.toxsoft.core.tslib.utils.TsLibUtils.*;

/**
 * Discrete output pin.
 *
 * @author max
 */
public interface IDOPin
    extends IPin {

  /**
   * Stub DO pin with ID {@link #NONE_ID} does nothing.
   */
  IDOPin STUB_DO_PIN = new InternalStubDOPin();

  /**
   * Sets the discrete output value.
   *
   * @param aValue {@link Boolean}- the value to set FIXME determine if <code>null</code> is allowed
   */
  void setDO( Boolean aValue );

}

/**
 * {@link IDOPin#STUB_DO_PIN} implementation.
 *
 * @author max
 */
class InternalStubDOPin
    implements IDOPin {

  @Override
  public EPinKind kind() {
    return EPinKind.DO;
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
  public void setDO( Boolean aValue ) {
    // does nothing
  }

}
