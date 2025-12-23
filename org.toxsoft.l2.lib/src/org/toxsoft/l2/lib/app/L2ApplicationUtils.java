package org.toxsoft.l2.lib.app;

import static org.toxsoft.l2.lib.IL2LibConstants.*;

import org.toxsoft.core.log4j.*;
import org.toxsoft.core.tslib.utils.valobj.*;
import org.toxsoft.l2.lib.devices.*;

/**
 * Static methods to prepare and work with L2 core library.
 *
 * @author hazard157
 */
public class L2ApplicationUtils {

  /**
   * Method must be called as soon as possible when L2 based application starts.
   */
  public static void initializeLibrary() {
    TsValobjUtils.registerKeeper( EPinKind.KEEPER_ID, EPinKind.KEEPER );
    LoggerWrapper.setScanPropertiesTimeout( LOGGER_PROPS_RESCAN_INTERVAL_MSECS );
  }

  /**
   * No subclasses.
   */
  private L2ApplicationUtils() {
    // nop
  }

}
