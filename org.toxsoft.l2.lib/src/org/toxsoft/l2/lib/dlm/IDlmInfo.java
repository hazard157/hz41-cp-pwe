package org.toxsoft.l2.lib.dlm;

import org.toxsoft.core.tslib.utils.*;
import org.toxsoft.core.tslib.utils.plugins.*;

/**
 * DLM meta-information.
 * <p>
 * Contains two parts:
 * <ul>
 * <li>unique identifier information - an ID {@link #moduleId()} and version {@link #version()}. These data is the same
 * TSLIB's plugin {@link IPluginInfo#pluginId()} and {@link IPluginInfo#pluginVersion()}.
 * <li>human readable information like name {@link #moduleName()}, {@link #developerCompany()} and
 * {@link #developerPersons()}. .</li>
 * </ul>
 * Two modules with the same ID {@link #moduleId()} are considered the same and can only differ in their version
 * {@link #version()}. However, two modules with the same ID are not allowed in the same directory.
 *
 * @author hazard157
 */
public interface IDlmInfo {

  /**
   * Возвращает идентификатор модуля.
   * <p>
   * Совпалает с идентификатором плагина {@link IPluginInfo#pluginId()}.
   *
   * @return String - идентификатор (ИД-путь) модуля
   */
  String moduleId();

  /**
   * Возвращает версию модуля.
   * <p>
   * Совпадает с версией модуля.
   *
   * @return {@link ITsVersion} - версия модуля
   */
  TsVersion version();

  /**
   * Возвращает удобочитаемое название модуля.
   *
   * @return String - название модуля
   */
  String moduleName();

  /**
   * Возвращает информацию о людях - авторах модуля.
   *
   * @return String - информация о людях - авторах
   */
  String developerPersons();

  /**
   * Возвращает информацию об организации - авторе модуля.
   *
   * @return String - информация об организации - авторе модуля
   */
  String developerCompany();

}
