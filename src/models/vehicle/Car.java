package models.vehicle;

public class Car extends Vehicle {
    private static final int INITIAL_PRICE = 7; 

    public Car (int controlNumber, int vacantNumber, String aditionalServices) {
        super(controlNumber, vacantNumber, aditionalServices);
    }

    public int getPrice(int hours) {
        if (hours <= 1)
            return Car.INITIAL_PRICE;
        else 
            return Car.INITIAL_PRICE + (hours * 4);
    }

}
