package org.toxsoft.l2.lib.app;

/**
 * Application run method return value.
 * <p>
 * Determines program exit code and if application should be restarted.
 *
 * @author hazard157
 * @param restart boolean - <code>true</code> application should be restarted
 * @param retCode int - value returned by the program when <code>restart</code> = false
 */
public record ExitCode ( boolean restart, int retCode ) {

  /**
   * Singleton value to finish successfully application for convenience.
   */
  public static final ExitCode OK = new ExitCode( false, 0 );

  /**
   * Singleton value to restart application for convenience.
   */
  public static final ExitCode RESTART = new ExitCode( true, 0 );

}
