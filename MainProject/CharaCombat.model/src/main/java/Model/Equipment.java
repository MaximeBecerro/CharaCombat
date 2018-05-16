/*
 *
 */
package Model;

import Contract.IEquipment;
import Contract.ListEquipment;

public abstract class Equipment implements IEquipment {
    private String name;

    public Equipment(final ListEquipment name) {

    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
