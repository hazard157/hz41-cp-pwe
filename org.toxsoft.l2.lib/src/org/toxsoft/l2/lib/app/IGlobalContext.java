package org.toxsoft.l2.lib.app;

import org.toxsoft.core.tslib.av.opset.*;
import org.toxsoft.l2.lib.dlm.*;
import org.toxsoft.l2.lib.hal.*;
import org.toxsoft.l2.lib.net.*;

/**
 * The context in which all components operate.
 * <p>
 * Components are large parts of the program managed by the main program {@link IL2Application}. Currently, the
 * following components exist:
 * <ul>
 * <li>{@link INetwork} - network, communication with the upper layer;</li>
 * <li>{@link IDlmManager} - loadable module manager;</li>
 * <li>{@link IHal} - access to inputs/outputs, console, and generally all control unit hardware.</li>
 * </ul>
 *
 * @author goga
 */
public interface IGlobalContext {

  /**
   * Global (common for the entire program) program settings.
   * <p>
   * The specified set contains all options from the {@link IGlobalOptionConstants} enumeration, as well as all
   * additional options specified in the configuration file and on the command line. If the same option is specified in
   * both cases, the command line options take precedence, followed by options specified in the configuration file, and
   * finally the default values ​​from the {@link IGlobalOptionConstants} are used.
   *
   * @return {@link IOptionSet} - application-wide global settings
   */
  IOptionSet globalOps();

  /**
   * Returns the application start time.
   *
   * @return long - start time in milliseconds from epoch
   */
  long startTime();

  /**
   * Returns component to access I/O hardware.
   *
   * @return {@link IHal} - I/O hardware component
   */
  IHal hal();

  /**
   * Returns component to access the network and USkat server.
   *
   * @return {@link INetwork} - network component
   */
  INetwork network();

  /**
   * Returns the DLM manager.
   *
   * @return {@link IDlmManager} - DLM manager
   */
  IDlmManager dlmManager();

  /**
   * Returns access to the application-specific API.
   *
   * @return Object - the application-specific API
   */
  IApp appApi();

}
