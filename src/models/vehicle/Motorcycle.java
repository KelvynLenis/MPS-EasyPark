package models.vehicle;

public class Motorcycle extends Vehicle{
    private static final int INITIAL_PRICE = 5; 

    public Motorcycle (int controlNumber, int vacantNumber, String aditionalServices) {
        super(controlNumber, vacantNumber, aditionalServices);
    }

    public int getPrice(int hours) {
        if (hours <= 1)
            return Motorcycle.INITIAL_PRICE;
        else 
            return Motorcycle.INITIAL_PRICE + (hours * 2);
    }

}
