package org.toxsoft.l2.test.exe;

import org.toxsoft.l2.lib.app.*;
import org.toxsoft.l2.test.exe.standalone.*;

/**
 * Simple standalone application launcher.
 *
 * @author hazard157
 */
public class MainStandalone {

  /**
   * Starting point.
   *
   * @param aArgs String[] command line arguments
   */
  public static void main( String[] aArgs ) {
    L2ApplicationUtils.initializeLibrary();
    IL2Application app = new StandaloneApplication( aArgs );
    ExitCode exitCode;
    do {
      exitCode = app.run();
    } while( exitCode.restart() );
    System.exit( exitCode.retCode() );
  }

}
