package models.vehicle;

public class VanFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices) {
        return new Van(controlNumber, vacantNumber, aditionalServices);
    }
}
