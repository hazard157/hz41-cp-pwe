package org.toxsoft.l2.lib.devices;

import static org.toxsoft.core.tslib.utils.TsLibUtils.*;

/**
 * Discrete input pin.
 *
 * @author max
 */
public interface IDIPin
    extends IPin {

  /**
   * Stub DI pin with ID {@link #NONE_ID} always returns <code>null</code>.
   */
  IDIPin STUB_DI_PIN = new InternalStubDIPin();

  /**
   * Returns the value of the discrete input.
   * <p>
   * Returns <code>null</code> if there was initialization error or device becomes broken.
   *
   * @return {@link Boolean} - input value or <code>null</code>
   */
  Boolean getDI();

}

/**
 * {@link IDIPin#STUB_DI_PIN} implementation.
 *
 * @author max
 */
class InternalStubDIPin
    implements IDIPin {

  @Override
  public EPinKind kind() {
    return EPinKind.DI;
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
  public Boolean getDI() {
    return null;
  }

}
