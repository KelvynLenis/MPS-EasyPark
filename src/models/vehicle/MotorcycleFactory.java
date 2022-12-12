package models.vehicle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour) {
        return new Motorcycle(controlNumber, vacantNumber, aditionalServices, priceBehaviour);
    }   
}
