package entity;

public class Pawn extends Piece{
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean moveValid() {
        return false;
    }
}
