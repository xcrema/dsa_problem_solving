package models;

public class ParkingFloor {
    ParkingSlot[] parkingSlots;

    public ParkingFloor(int noOfParkingSlots) {
        this.parkingSlots = new ParkingSlot[noOfParkingSlots];

        for (int i = 0; i < noOfParkingSlots; i++) {
            VehicleType vehicleType;
            if (i==0) {
                vehicleType = VehicleType.TRUCK;
            } else if (i == 1 || i == 2) {
                vehicleType = VehicleType.BIKE;
            } else {
                vehicleType = VehicleType.CAR;
            }
            parkingSlots[i] = new ParkingSlot(vehicleType, null);
        }
    }
}
