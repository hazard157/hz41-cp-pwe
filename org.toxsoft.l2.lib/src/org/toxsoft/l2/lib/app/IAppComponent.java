package org.toxsoft.l2.lib.app;

import org.toxsoft.core.tslib.bricks.*;
import org.toxsoft.l2.lib.hal.*;

/**
 * Component implementing application common and specific code.
 *
 * @author max
 */
public interface IAppComponent
    extends ICooperativeWorkerComponent, IHalErrorProcessor,
    // IInvokable, IInvokableInfo, FIXME do we need it?
    IApp {

  // пока пусто
}
