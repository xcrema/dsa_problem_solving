package entity;

public class Queen extends Piece{
    public Queen(boolean white) {
        super(white);
    }

    @Override
    public boolean moveValid() {
        return false;
    }
}
