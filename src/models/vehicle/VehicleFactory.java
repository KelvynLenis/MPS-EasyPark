package models.vehicle;

public abstract class VehicleFactory {
    
    public abstract Vehicle addVehicle(int controlNumber, int vacantNumber, String aditionalServices, PriceBehaviour priceBehaviour);

}
