package org.toxsoft.l2.lib.hal;

import org.toxsoft.core.tslib.av.opset.*;
import org.toxsoft.core.tslib.bricks.strid.coll.*;
import org.toxsoft.l2.lib.devices.*;
import org.toxsoft.l2.lib.reserve.*;

/**
 * HAL - Hardware Abstraction Layer. <o> HAL provides access to the physical input/output. Physical I/O is modelled by
 * two ways:
 * <ul>
 * <li><b>pins</b> - common signal I/O as AI/AO/DI/DO;</li>
 * <li><b>specific devices</b> - any other I/O device each with the specific API.</li>
 * </ul>
 *
 * @author max
 */
public interface IHal
    extends IHealthMeasurable {

  /**
   * Returns all known pins.
   *
   * @return {@link IStridablesList}&lt;{@link IPin}&gt; - list of all pins
   */
  IStridablesList<? extends IPin> listPins();

  /**
   * Returns all known analog input pins.
   *
   * @return {@link IStridablesList}&lt;{@link IAIPin}&gt; - list of all AI pins
   */
  IStridablesList<? extends IAIPin> listAIPins();

  /**
   * Returns all known analog output pins.
   *
   * @return {@link IStridablesList}&lt;{@link IAOPin}&gt; - list of all AO pins
   */
  IStridablesList<? extends IAOPin> listAOPins();

  /**
   * Returns all known discrete input pins.
   *
   * @return {@link IStridablesList}&lt;{@link IDIPin}&gt; - list of all DI pins
   */
  IStridablesList<? extends IDIPin> listDIPins();

  /**
   * Returns all known discrete output pins.
   *
   * @return {@link IStridablesList}&lt;{@link IDOPin}&gt; - list of all DO pins
   */
  IStridablesList<? extends IDOPin> listDOPins();

  /**
   * Returns all known specific devices.
   *
   * @return {@link IStridablesList}&lt;{@link ISpecificDevice}&gt; - list of specific devices
   */
  IStridablesList<? extends ISpecificDevice> listSpecificDevices();

  /**
   * Return HAT configuration parameters.
   *
   * @return {@link IOptionSet} - HAT configuration parameters
   */
  IOptionSet options();

  /**
   * Determines HAL is in "reserve" state.
   * <p>
   * "Reserve" means the equipment operates as a backup (all devices communicating with the hardware are in a disabled
   * state (or in reserve)).
   *
   * @return boolean - the reserve state flag<br>
   *         <b>true</b> - "reserve", hardware is not working, waiting to became operational;<br>
   *         <b>false</b> - "master", hardware is fully operating.
   */
  boolean isWorkAsReserve();

  /**
   * Queries hardware to go to "reserver" state.
   * <p>
   * Request that the HAL enter the reserve state (those devices that should be in reserve). The method should return
   * control immediately. Whether the HAL has entered the reserve state should be determined using the
   * {@link #isWorkAsReserve()} == <code>true</code> method.
   */
  void queryReserve();

  /**
   * Queries hardware to go to "master" state.
   * <p>
   * Request that the HAL enter the "master" state. The method should return control immediately. Whether the HAL has
   * entered the master state should be determined using the {@link #isWorkAsReserve()}==false method.
   */
  void queryMain();
}
