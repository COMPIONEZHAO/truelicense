/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package org.truelicense.it.v1

import org.truelicense.it.core.TestContext
import org.truelicense.v1.common.V1Compression

/** @author Christian Schlichtherle */
trait V1CompressionTestContext { this: TestContext =>
  final override def transformation = new V1Compression
}
