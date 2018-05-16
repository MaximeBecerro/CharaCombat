/*
 *
 */
package Main;

import Contract.ICharacter;
import Contract.RandomGenerator;
import Contract.Type;
import Controller.Damage;
import Model.Character;
import Model.EquipmentFactory;
import View.TextDisplay;

public class Combat {
    private ICharacter      ch1, ch2;
    private RandomGenerator rGen;
    private Damage          damage;
    private int             countRound = 0;

    public Combat() {
        this.init();
        this.play();
    }

    private void init() {
        this.setCh1(new Character("Yvain", Type.WARRIOR, 100, 0, 0, 5, 0, 5, 5, 15, 5,
                EquipmentFactory.createIronSword(), EquipmentFactory.createIronShield()));
        this.setCh2(new Character("Gauvin", Type.WARRIOR, 100, 0, 0, 5, 0, 5, 5, 15, 5,
                EquipmentFactory.createIronSword(), EquipmentFactory.createIronShield()));
        this.setrGen(new RandomGenerator());
        this.setDamage(new Damage());
    }

    public void play() {
        while ((this.ch2.getHealth() >= 0) && (this.ch1.getHealth() >= 0)) {

            final int j = this.countRound++;
            TextDisplay.round(this.ch1.getName(), this.ch2.getName(), this.countRound, this.ch1.getHealth(),
                    this.ch2.getHealth());

            this.ch2.setHealth(this.damage.deal(this.ch1, this.ch2));

            this.ch1.setHealth(this.damage.deal(this.ch2, this.ch1));

            if (this.ch1.getHealth() < 0) {
                TextDisplay.death(this.ch1.getName(), this.ch2.getName(), this.countRound, this.ch2.getHealth());
            } else if (this.ch2.getHealth() < 0) {
                TextDisplay.death(this.ch2.getName(), this.ch1.getName(), this.countRound, this.ch1.getHealth());
            } else if ((this.ch1.getHealth() < 0) && (this.ch2.getHealth() < 0)) {
                TextDisplay.egality();
                // c'est ICI!!!
            }

        }
    }

    private ICharacter getCh1() {
        return this.ch1;
    }

    private void setCh1(final ICharacter ch1) {
        this.ch1 = ch1;
    }

    private ICharacter getCh2() {
        return this.ch2;
    }

    private void setCh2(final ICharacter ch2) {
        this.ch2 = ch2;
    }

    private RandomGenerator getrGen() {
        return this.rGen;
    }

    private void setrGen(final RandomGenerator rGen) {
        this.rGen = rGen;
    }

    private Damage getDamage() {
        return this.damage;
    }

    private void setDamage(final Damage damage) {
        this.damage = damage;
    }

    private int getCountRound() {
        return this.countRound;
    }

    private void setCountRound(final int countRound) {
        this.countRound = countRound;
    }
}
