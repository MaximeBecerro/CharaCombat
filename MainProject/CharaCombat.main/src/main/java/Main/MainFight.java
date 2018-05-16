/*
 *
 */
package Main;

import Contract.IGame;
import Controller.MainController;
import Model.Game;
import View.TextDisplay;

public class MainFight {
    private IGame          game;
    private MainController mainController;
    private TextDisplay    textDisplay;

    public MainFight() {
        this.init();
        this.play();
    }

    public void play() {
        while ((this.getGame().getCh1().getHealth() > 0) && (this.getGame().getCh2().getHealth() > 0)) {

            this.getMainController().oneRound(this.getGame());
            this.getTextDisplay().showResult(this.getGame());
        }
    }

    private void init() {
        this.setGame(new Game("Yvain", "Gauvin"));
        this.setTextDisplay(new TextDisplay());
        this.setMainController(new MainController());

    }

    public IGame getGame() {
        return this.game;
    }

    public void setGame(final IGame game) {
        this.game = game;
    }

    public MainController getMainController() {
        return this.mainController;
    }

    public void setMainController(final MainController mainController) {
        this.mainController = mainController;
    }

    public TextDisplay getTextDisplay() {
        return this.textDisplay;
    }

    public void setTextDisplay(final TextDisplay textDisplay) {
        this.textDisplay = textDisplay;
    }
}
