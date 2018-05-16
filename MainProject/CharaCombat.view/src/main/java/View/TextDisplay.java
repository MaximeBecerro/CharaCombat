/*
 *
 */
package View;

public class TextDisplay {
    private static void display(final String text) {
        System.out.println(text);
    }

    public static void round(final String namech1, final String namech2, final int round, final float healthch1,
            final float healthch2) {
        TextDisplay.display("Round " + round + " : " + namech1 + "'s HP : " + healthch1);
        TextDisplay.display("          " + namech2 + "'s HP : " + healthch2);
    }

    public static void death(final String namech1, final String namech2, final int round, final float winnerHealth) {

        TextDisplay.display(
                namech1 + " died at the round " + round + " and " + namech2 + " win with " + winnerHealth + " HP ");

    }

    public static void egality() {
        TextDisplay.display("Nos deux Héros ont succombé au combat");
        // ET ICI AUSSI
    }
}
