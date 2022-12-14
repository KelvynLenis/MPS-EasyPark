package models.vehicle;

public class BigCarFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour) {
        return new BigCar(controlNumber, vacantNumber, aditionalServices, priceBehaviour);
    }
}
