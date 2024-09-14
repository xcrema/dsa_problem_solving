package Entities;

public abstract class Position {

    private int top;
    private int bottom;

    public Position(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

//    public abstract boolean isValidMove(Board board, Spot start, Spot end);
}
