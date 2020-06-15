package br.com.game;

import br.com.game.entities.Player;
import org.newdawn.slick.*;

/**
 * All game activities occurs here.
 */
public class Setup extends BasicGame {

    private Player playerOne;

    public Setup(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        this.playerOne = new Player(
                0.0F, 0.0F, 50.0F, 50.0F, 0.5F, Boolean.TRUE, 2, Boolean.FALSE
        );
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        if (container.getInput().isKeyDown(Input.KEY_UP)) {
            playerOne.moveUp(delta);
        }
        if (container.getInput().isKeyDown(Input.KEY_DOWN)) {
            playerOne.moveDown(delta);
        }
        if (container.getInput().isKeyDown(Input.KEY_LEFT)) {
            playerOne.moveLeft(delta);
        }
        if (container.getInput().isKeyDown(Input.KEY_RIGHT)) {
            playerOne.moveRight(delta);
        }
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString("Olá, mundo!", 100.0f, 100.0f);
        playerOne.drawHitbox(g);
    }
}
