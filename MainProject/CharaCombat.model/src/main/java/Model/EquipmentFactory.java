/*
 *
 */
package Model;

import Contract.IArmor;
import Contract.IWeapon;
import Contract.ListEquipment;

public abstract class EquipmentFactory {
    public static IArmor createIronShield() {
        return new Armor(ListEquipment.IRONSHIELD, 10);
    }

    public static IArmor createClothCape() {
        return new Armor(ListEquipment.CLOTHCAPE, 10);
    }

    public static IWeapon createIronSword() {
        return new Weapon(ListEquipment.IRONSWORD, 10);
    }

    public static IWeapon createWoodenbow() {
        return new Weapon(ListEquipment.WOODENBOW, 10);
    }
}
