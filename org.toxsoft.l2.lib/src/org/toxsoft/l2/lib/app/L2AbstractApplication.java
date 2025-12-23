package org.toxsoft.l2.lib.app;

import org.toxsoft.core.tslib.utils.*;

/**
 * Abstract base implementation of any L2 application.
 *
 * @author hazard157
 */
public abstract non-sealed class L2AbstractApplication
    implements IL2Application {

  /**
   * Constructor.
   *
   * @param aArgs String[] - command line arguments
   */
  public L2AbstractApplication( String[] aArgs ) {

    // TODO L2AbstractApplication.L2AbstractApplication()

  }

  // ------------------------------------------------------------------------------------
  // IL2Application
  //

  int counter = 5;

  @Override
  public ExitCode run() {

    // TODO Auto-generated method stub
    TsTestUtils.pl( "Hello, world!" );

    if( --counter > 0 ) {
      return ExitCode.RESTART;
    }

    return ExitCode.OK;
  }

}
