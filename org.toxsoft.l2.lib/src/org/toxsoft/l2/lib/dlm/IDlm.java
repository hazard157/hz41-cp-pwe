package org.toxsoft.l2.lib.dlm;

import org.toxsoft.core.tslib.bricks.*;
import org.toxsoft.l2.lib.cfg.*;

/**
 * Entry point of the loaded DLM.
 *
 * @author hazard157
 */
public interface IDlm
    extends ICooperativeWorkerComponent,
    // IInvokable, FIXME do we really sue invokable interface?
    IConfigurableUnit {

  /**
   * Возвращает идентификационную информацию о модуле.
   * <p>
   * Это та же информация, которую возвращает фабрика этого модуле в методе {@link IDlmFactory#info()}.
   *
   * @return {@link IDlmInfo} - информация о модуле.
   */
  IDlmInfo info();

}
