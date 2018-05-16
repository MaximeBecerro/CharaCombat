/*
 *
 */
package Model;

import Contract.IArmor;
import Contract.ICharacter;
import Contract.IWeapon;
import Contract.Type;

public class Character implements ICharacter {
    private String  name;
    private Type    type;
    private float   health;
    private float   mana;
    private float   damage;
    private float   resistance;
    private float   strength;     // d�gats guerrier
    private float   agility;      // d�gats archer
    private float   intelligence; // d�gats mage
    private float   endurance;    // r�sistance d�gats
    private float   luck;         // coup critique
    private IWeapon weapon;
    private IArmor  armor;

    public Character(final String name, final Type type, final float health, final float mana, final float damage,
            final float resistance, final float strength, final float agility, final float intelligence,
            final float endurance, final float luck, final IWeapon weapon, final IArmor armor) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.mana = mana;
        this.damage = damage;
        this.resistance = resistance;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.endurance = endurance;
        this.luck = luck;
        this.weapon = weapon;
        this.armor = armor;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(final Type type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public float getHealth() {
        return this.health;
    }

    public void setHealth(final float health) {
        this.health = health;
    }

    public float getMana() {
        return this.mana;
    }

    public void setMana(final float mana) {
        this.mana = mana;
    }

    public float getResistance() {
        return this.resistance;
    }

    public void setResistance(final int resistance) {
        this.resistance = resistance;
    }

    public float getDamage() {
        return this.damage;
    }

    public void setDamage(final float damage) {
        this.damage = damage;
    }

    public float getStrength() {
        return this.strength;
    }

    public void setStrength(final int strength) {
        this.strength = strength;
    }

    public float getAgility() {
        return this.agility;
    }

    public void setAgility(final int agility) {
        this.agility = agility;
    }

    public float getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(final int intelligence) {
        this.intelligence = intelligence;
    }

    public float getEndurance() {
        return this.endurance;
    }

    public void setEndurance(final int endurance) {
        this.endurance = endurance;
    }

    public float getLuck() {
        return this.luck;
    }

    public void setLuck(final int luck) {
        this.luck = luck;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(final IWeapon weapon) {
        this.weapon = weapon;
    }

    public IArmor getArmor() {
        return this.armor;
    }

    public void setArmor(final IArmor armor) {
        this.armor = armor;
    }

}
