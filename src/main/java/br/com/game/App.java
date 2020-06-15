package br.com.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Launches the game.
 */
public class App {

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new Setup("OlaMundo"));
            app.setDisplayMode(640, 480, Boolean.FALSE);
            app.setTargetFrameRate(60);
            app.start();
        } catch (SlickException e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
