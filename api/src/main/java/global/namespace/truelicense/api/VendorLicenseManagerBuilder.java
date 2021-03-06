/*
 * Copyright (C) 2005-2017 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */
package global.namespace.truelicense.api;

import global.namespace.truelicense.api.builder.GenBuilder;

/**
 * A builder for {@linkplain VendorLicenseManager vendor license managers}.
 * Call its {@link #build} method to obtain the configured vendor license
 * manager.
 *
 * @author Christian Schlichtherle
 */
public interface VendorLicenseManagerBuilder
        extends LicenseManagerBuilderMixin<VendorLicenseManagerBuilder>,
        GenBuilder<VendorLicenseManager> {
}
