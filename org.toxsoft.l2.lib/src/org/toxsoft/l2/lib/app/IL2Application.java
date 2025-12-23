package org.toxsoft.l2.lib.app;

/**
 * L2 application control methods published as a separate interface.
 * <p>
 * Create {@link L2AbstractApplication} subclass implementation and use it via this interface.
 *
 * @author hazard157
 */
public sealed interface IL2Application
    permits L2AbstractApplication {

  /**
   * Starts execution and runs the application.
   * <p>
   * Exit code determines if application should be restarted and program return value if not.
   *
   * @return {@link ExitCode} - exit code
   */
  ExitCode run();

  // TODO start/stop/restart etc???

}
