package entity;

import java.util.List;

public class Game {

    private Player[] players;

    private Board board;

    private Player currentPlayer;

    private GameStatus gameStatus;

    private List<Move> movesPlayed;

    public Game() {
        players = new Player[2];
    }

    private void startGame(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;
        board = new Board();
        if(p1.isWhiteSide()) {
            currentPlayer = p1;
        } else {
            currentPlayer = p2;
        }
    }

    private boolean playerMove(Player player, int startX, int startY, int endX, int endY) {

        Spot start = board.getSpots()[startX][startY];
        Spot end = board.getSpots()[endX][endY];

        Piece sourcePiece = end.getPiece();

        if (!sourcePiece.moveValid()) {
            return false;
        }

        Piece destPiece = end.getPiece();

        if (destPiece != null) {
            destPiece.setKilled(true);
        }

        end.setPiece(sourcePiece);
        start.setPiece(null);

        if (destPiece instanceof King) {
            if (player.isWhiteSide()) {
                gameStatus = GameStatus.WHITEWIN;
            } else {
                gameStatus = GameStatus.BLACKWIN;
            }
        }

        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }

        movesPlayed.add(new Move(player, start, end, sourcePiece, destPiece));

        return true;
    }
}
