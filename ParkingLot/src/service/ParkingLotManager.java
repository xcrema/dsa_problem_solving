package service;

import models.ParkingLot;

import java.util.Map;

public class ParkingLotManager {
    ParkingLot parkingLot;
    Map<Integer, >

    public ParkingLotManager(String parkingLotId, int noOfFloors, int noOfSlotsPerFloor) {
        this.parkingLot = new ParkingLot(parkingLotId, noOfFloors, noOfSlotsPerFloor);

    }


}
