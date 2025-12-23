package org.toxsoft.l2.lib.dlm;

import org.toxsoft.core.tslib.coll.*;

/**
 * DLM (Dynamically Loadable Module) manager.
 *
 * @author goga
 */
public interface IDlmManager {

  /**
   * Returns all found DLMs.
   *
   * @return {@link IList} - список загруженных модулей.
   */
  IList<IDlm> modules();

}
