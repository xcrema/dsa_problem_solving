package models;

import java.util.Arrays;

public class ParkingLot {
    String parkingLotId;
    ParkingFloor[] parkingFloors;

    public ParkingLot(String parkingLotId, int noOfParkingFloors, int noOfParkingSlots) {
        this.parkingLotId = parkingLotId;
        this.parkingFloors = new ParkingFloor[noOfParkingFloors];

        Arrays.fill(parkingFloors, new ParkingFloor(noOfParkingSlots));
    }
}
