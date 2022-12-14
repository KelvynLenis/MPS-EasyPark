package models.vehicle;

public class SmallCarFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour) {
        return new SmallCar(controlNumber, vacantNumber, aditionalServices, priceBehaviour);
    }
}
