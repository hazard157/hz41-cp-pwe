package org.toxsoft.l2.lib.net;

import org.toxsoft.uskat.core.connection.*;

/**
 * Network layer.
 *
 * @author max
 */
public interface INetwork {

  /**
   * Returns the connection to the server.
   *
   * @return ISkConnection - connection to the server
   */
  ISkConnection getSkConnection();

}
