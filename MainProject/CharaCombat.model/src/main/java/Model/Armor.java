/*
 *
 */
package Model;

import Contract.IArmor;
import Contract.ListEquipment;

public class Armor extends Equipment implements IArmor {

    private int armorBonus;

    public Armor(final ListEquipment name, final int armorBonus) {
        super(name);
        this.armorBonus = armorBonus;

    }

    public int getArmorBonus() {
        return this.armorBonus;
    }

    public void setArmorBonus(final int armorBonus) {
        this.armorBonus = armorBonus;
    }

}
