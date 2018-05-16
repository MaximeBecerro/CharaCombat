/*
 *
 */
package Contract;

public interface ICharacter {
    public Type getType();

    public void setType(final Type type);

    public String getName();

    public void setName(final String name);

    public float getHealth();

    public void setHealth(final float health);

    public float getMana();

    public void setMana(final float mana);

    public float getResistance();

    public void setResistance(final int resistance);

    public float getDamage();

    public void setDamage(final float damage);

    public float getStrength();

    public void setStrength(final int strength);

    public float getAgility();

    public void setAgility(final int agility);

    public float getIntelligence();

    public void setIntelligence(final int intelligence);

    public float getEndurance();

    public void setEndurance(final int endurance);

    public float getLuck();

    public void setLuck(final int luck);

    public IWeapon getWeapon();

    public void setWeapon(final IWeapon weapon);

    public IArmor getArmor();

    public void setArmor(final IArmor armor);
}
