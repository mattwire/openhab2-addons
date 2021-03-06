/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.imperihome.internal.model.device;

import org.eclipse.smarthome.core.items.Item;
import org.openhab.io.imperihome.internal.model.param.NumericValueParam;

/**
 * Parent of devices with a {@link NumericValueParam}. Contains the value unit.
 *
 * @author Pepijn de Geus - Initial contribution
 */
public abstract class AbstractNumericValueDevice extends AbstractDevice {

    private transient String unit;

    public AbstractNumericValueDevice(DeviceType type, Item item, String defaultUnit) {
        super(type, item);
        this.unit = defaultUnit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "super=" + super.toString() + ", unit='" + unit + '\'' + '}';
    }

}
