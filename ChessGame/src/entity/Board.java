package entity;

public class Board {

    private Spot[][] spots;

    public Board() {
        this.startBoard();
    }

    public Spot[][] getSpots() {
        return spots;
    }

    public void setSpots(Spot[][] spots) {
        this.spots = spots;
    }

    private void startBoard() {

        //sets white pieces
        spots[0][0] = new Spot(0, 0, new Rook(true));
        spots[0][1] = new Spot(0, 1, new Knight(true));
        spots[0][2] = new Spot(0, 2, new Bishop(true));
        spots[0][3] = new Spot(0, 3, new King(true));
        spots[0][4] = new Spot(0, 4, new Queen(true));
        spots[0][5] = new Spot(0, 5, new Bishop(true));
        spots[0][6] = new Spot(0, 6, new Knight(true));
        spots[0][7] = new Spot(0, 7, new Rook(true));

        for (int i = 0; i < 8; i++) {
            spots[1][i] = new Spot(1, i, new Pawn(true));
        }

        //sets black pieces
        spots[7][0] = new Spot(7, 0, new Rook(false));
        spots[7][1] = new Spot(7, 1, new Knight(false));
        spots[7][2] = new Spot(7, 2, new Bishop(false));
        spots[7][3] = new Spot(7, 3, new King(false));
        spots[7][4] = new Spot(7, 4, new Queen(false));
        spots[7][5] = new Spot(7, 5, new Bishop(false));
        spots[7][6] = new Spot(7, 6, new Knight(false));
        spots[7][7] = new Spot(7, 7, new Rook(false));

        for (int i = 0; i < 8; i++) {
            spots[6][i] = new Spot(6, i, new Pawn(false));
        }

        //set remaining pieces
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                spots[i][j] = new Spot(i, j, null);
            }
        }
    }
}
