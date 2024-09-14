package Entities;

public class Board {

    private Spot[][] spots;

    public Board(Spot[][] spots) {
        this.spots = spots;
    }

    public Spot[][] getSpots() {
        return spots;
    }

    public void setSpots(Spot[][] spots) {
        this.spots = spots;
    }
}
