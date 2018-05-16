/*
 *
 */
package Controller;

import Contract.IArmor;
import Contract.ICharacter;
import Contract.IRandomGenerator;
import Contract.IWeapon;
import Contract.RandomGenerator;

public class Damage {
    public Damage() {
    }

    public float calculateDamage(final ICharacter attacker, final ICharacter defenser, final float keyStat,
            final IWeapon weapon, final IArmor armor) {
        return Math.round(defenser.getHealth() - ((this.calculateAttackerCritical(attacker.getLuck())
                * this.calculateDefenserCritical(defenser.getLuck())
                * ((attacker.getDamage() + weapon.getDamageBonus()) + (attacker.getDamage() * (keyStat / 100))))
                / (((defenser.getResistance() + armor.getArmorBonus()) / 100)
                        + (defenser.getResistance() * (defenser.getEndurance() / 50)))));
    }

    private float calculateAttackerCritical(final float luck) {
        final IRandomGenerator rGen = new RandomGenerator();
        if (luck > rGen.getRandom()) {
            return 3;
        } else {
            return 1;
        }
    }

    private float calculateDefenserCritical(final float luck) {
        final IRandomGenerator rGen = new RandomGenerator();
        if (luck > rGen.getRandom()) {
            return 0;
        } else {
            return 1;
        }
    }

    public float deal(final ICharacter attacker, final ICharacter defenser) {
        switch (attacker.getType()) {
        case MARKSMAN:
            return this.calculateDamage(attacker, defenser, attacker.getAgility(), attacker.getWeapon(),
                    attacker.getArmor());
        case WARRIOR:
            return this.calculateDamage(attacker, defenser, attacker.getStrength(), attacker.getWeapon(),
                    attacker.getArmor());
        case MAGE:
            return this.calculateDamage(attacker, defenser, attacker.getIntelligence(), attacker.getWeapon(),
                    attacker.getArmor());
        default:
            return 0;
        }
    }
}