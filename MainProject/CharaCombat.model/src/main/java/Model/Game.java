/*
 *
 */
package Model;

import Contract.ICharacter;
import Contract.IGame;
import Contract.Type;

public class Game implements IGame {
    private ICharacter ch1, ch2;
    private int        round;

    public Game(final String ch1name, final String ch2name) {
        this.setRound(0);
        this.setCh1(new Character(ch1name, Type.WARRIOR, 100, 0, 0, 5, 0, 5, 5, 15, 5,
                EquipmentFactory.createIronSword(), EquipmentFactory.createIronShield()));
        this.setCh2(new Character(ch2name, Type.WARRIOR, 100, 0, 0, 5, 0, 5, 5, 15, 5,
                EquipmentFactory.createIronSword(), EquipmentFactory.createIronShield()));
    }

    public ICharacter getCh1() {
        return this.ch1;
    }

    public void setCh1(final ICharacter ch1) {
        this.ch1 = ch1;
    }

    public ICharacter getCh2() {
        return this.ch2;
    }

    public void setCh2(final ICharacter ch2) {
        this.ch2 = ch2;
    }

    public int getRound() {
        return this.round;
    }

    public void setRound(final int round) {
        this.round = round;
    }

}
