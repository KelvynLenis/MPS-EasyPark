package models.vehicle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices) {
        return new Motorcycle(controlNumber, vacantNumber, aditionalServices);
    }   
}
