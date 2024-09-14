package models;

public class VehicleDetails {
    VehicleType vehicleType;
    String registrationNo;
    String color;

    public VehicleDetails(VehicleType vehicleType, String registrationNo, String color) {
        this.vehicleType = vehicleType;
        this.registrationNo = registrationNo;
        this.color = color;
    }
}
