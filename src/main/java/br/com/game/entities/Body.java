package br.com.game.entities;

/**
 * All bodies have a coordinate, width, height, ammount of speed and capability of movements.
 */
public abstract class Body {

    private Float x;
    private Float y;
    private Float width;
    private Float height;
    private Float speed;
    private Boolean movable;

    public Body(Float x, Float y, Float width, Float height, Float speed, Boolean movable) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.movable = movable;
    }

    public Body(Float x, Float y, Float speed, Boolean movable) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.movable = movable;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Boolean isMovable() {
        return movable;
    }

    public void setMovable(Boolean movable) {
        this.movable = movable;
    }
}