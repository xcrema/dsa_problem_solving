package Entities;

public class Spot {

    private int x;
    private int y;
    private Position position;

    public Spot(int x, int y, Position position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
