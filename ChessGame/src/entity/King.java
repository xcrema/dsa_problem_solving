package entity;

public class King extends Piece{

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean moveValid() {
        return false;
    }
}
