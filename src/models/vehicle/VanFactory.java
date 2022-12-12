package models.vehicle;

public class VanFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour) {
        return new Van(controlNumber, vacantNumber, aditionalServices, priceBehaviour);
    }
}
