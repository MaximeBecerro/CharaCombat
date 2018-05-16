/*
 *
 */
package Contract;

public interface IGame {
    public ICharacter getCh1();

    public void setCh1(final ICharacter ch1);

    public ICharacter getCh2();

    public void setCh2(final ICharacter ch2);

    public int getRound();

    public void setRound(int round);

}
