/*
 *
 */
package View;

import Contract.IGame;

public class TextDisplay {

    private void display(final String text) {
        System.out.println(text);
    }

    public void death(final String namech1, final String namech2, final int round, final float winnerHealth) {

        this.display(
                namech1 + " died at the round " + round + " and " + namech2 + " win with " + winnerHealth + " HP ");

    }

    public void tie() {
        this.display("Nos deux Héros ont succombé au combat");
        // ET ICI AUSSI
    }

    public void showResult(final IGame game) {
        this.display(
                "Round " + game.getRound() + " : " + game.getCh1().getName() + "'s HP : " + game.getCh1().getHealth());
        this.display("          " + game.getCh2().getName() + "'s HP : " + game.getCh2().getHealth());
        if ((game.getCh1().getHealth() <= 0) && (game.getCh2().getHealth() <= 0)) {
            this.tie();
        } else if (game.getCh2().getHealth() <= 0) {
            this.death(game.getCh2().getName(), game.getCh1().getName(), game.getRound(), game.getCh1().getHealth());
        } else if (game.getCh1().getHealth() <= 0) {
            this.death(game.getCh1().getName(), game.getCh2().getName(), game.getRound(), game.getCh2().getHealth());
        }
    }
}
