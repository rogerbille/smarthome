/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.binding.xml.internal;

import org.eclipse.smarthome.config.core.ConfigDescription;
import org.eclipse.smarthome.config.core.ConfigDescriptionProvider;
import org.eclipse.smarthome.core.binding.BindingInfo;

/**
 * The {@link BindingInfoXmlResult} is an intermediate XML conversion result object which
 * contains a mandatory {@link BindingInfo} and an optional {@link ConfigDescription} object.
 * <p>
 * If a {@link ConfigDescription} object exists, it must be added to the according {@link ConfigDescriptionProvider}.
 *
 * @author Michael Grammling - Initial Contribution
 */
public class BindingInfoXmlResult {

    private BindingInfo bindingInfo;
    private ConfigDescription configDescription;

    public BindingInfoXmlResult(BindingInfo bindingInfo, ConfigDescription configDescription)
            throws IllegalArgumentException {

        if (bindingInfo == null) {
            throw new IllegalArgumentException("The BindingInfo must not be null!");
        }

        this.bindingInfo = bindingInfo;
        this.configDescription = configDescription;
    }

    public BindingInfo getBindingInfo() {
        return this.bindingInfo;
    }

    public ConfigDescription getConfigDescription() {
        return this.configDescription;
    }

    @Override
    public String toString() {
        return "BindingInfoXmlResult [bindingInfo=" + bindingInfo + ", configDescription=" + configDescription + "]";
    }

}
