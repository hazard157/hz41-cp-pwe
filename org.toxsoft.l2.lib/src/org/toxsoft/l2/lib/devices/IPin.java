package org.toxsoft.l2.lib.devices;

import org.toxsoft.core.tslib.bricks.strid.*;

/**
 * Base interface of single pin - physical I/O signal. Один вход-выход устройства (одна ножка устройства)
 *
 * @author max
 */
public interface IPin
    extends IStridable {

  /**
   * Returns the pin kind.
   *
   * @return EPinKind - the pin kind
   */
  EPinKind kind();
}
