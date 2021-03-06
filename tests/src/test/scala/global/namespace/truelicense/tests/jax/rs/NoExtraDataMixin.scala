/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package global.namespace.truelicense.tests.jax.rs

import global.namespace.truelicense.tests.core.TestContext

trait NoExtraDataMixin { this: TestContext =>

  final override def extraData: AnyRef = null
}
