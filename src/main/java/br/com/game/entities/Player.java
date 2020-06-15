package br.com.game.entities;

import org.newdawn.slick.Graphics;

/**
 * All Players are a Body and have hp. Can be immortal or don't.
 */
public class Player extends Body {

    private Integer hp;
    private Boolean immortal;

    public Player(Float x, Float y, Float width, Float height, Float speed, Boolean movable, Integer hp, Boolean immortal) {
        super(x, y, width, height, speed, movable);
        this.hp = hp;
        this.immortal = immortal;
    }

    public Player(Float x, Float y, Float speed, Boolean movable) {
        super(x, y, speed, movable);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Boolean isImmortal() {
        return immortal;
    }

    public void setImmortal(Boolean immortal) {
        this.immortal = immortal;
    }

    public void moveUp(Integer delta) {
        if(this.isMovable()) {
            this.setY(this.getY() - (delta * this.getSpeed()));
        }
    }

    public void moveDown(Integer delta) {
        if(this.isMovable()) {
            this.setY(this.getY() + (delta * this.getSpeed()));
        }
    }

    public void moveLeft(Integer delta) {
        if(this.isMovable()) {
            this.setX(this.getX() - (delta * this.getSpeed()));
        }
    }

    public void moveRight(Integer delta) {
        if(this.isMovable()) {
            this.setX(this.getX() + (delta * this.getSpeed()));
        }
    }

    public void drawHitbox(Graphics graphics) {
        graphics.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

}
