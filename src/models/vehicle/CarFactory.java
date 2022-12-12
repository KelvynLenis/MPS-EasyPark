package models.vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour) {
        return new Car(controlNumber, vacantNumber, aditionalServices, priceBehaviour);
    }
}
