package models;

public class ParkingSlot {
    VehicleType vehicleType;
    VehicleDetails vehicleDetails;

    public ParkingSlot(VehicleType vehicleType, VehicleDetails vehicleDetails) {
        this.vehicleType = vehicleType;
        this.vehicleDetails = vehicleDetails;
    }
}
