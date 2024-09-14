package entity;

public class Rook extends Piece{
    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean moveValid() {
        return false;
    }
}
