package org.toxsoft.l2.lib.devices;

import static org.toxsoft.core.tslib.utils.TsLibUtils.*;

/**
 * Analog output pin.
 *
 * @author max
 */
public interface IAOPin
    extends IPin {

  /**
   * Stub AO pin with ID {@link #NONE_ID} does nothing.
   */
  IAOPin STUB_AO_PIN = new InternalStubAOPin();

  /**
   * Sets the analog output value.
   *
   * @param aValue {@link Float} - the value to set FIXME determine if <code>null</code> is allowed
   */
  void setAO( Float aValue );

}

/**
 * {@link IAOPin#STUB_AO_PIN} implementation.
 *
 * @author max
 */
class InternalStubAOPin
    implements IAOPin {

  @Override
  public EPinKind kind() {
    return EPinKind.AO;
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
  public void setAO( Float aValue ) {
    // does nothing
  }

}
