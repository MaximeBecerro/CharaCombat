/*
 *
 */
package Model;

import Contract.IWeapon;
import Contract.ListEquipment;

public class Weapon extends Equipment implements IWeapon {

    private int damageBonus;

    public Weapon(final ListEquipment name, final int damageBonus) {
        super(name);
        this.damageBonus = damageBonus;
        // TODO Auto-generated constructor stub
    }

    public int getDamageBonus() {
        return this.damageBonus;
    }

    public void setDamageBonus(final int damageBonus) {
        this.damageBonus = damageBonus;
    }

}
