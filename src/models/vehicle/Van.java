package models.vehicle;

public class Van extends Vehicle {
    
    private static final int INITIAL_PRICE = 10;

    public Van (int controlNumber, int vacantNumber, String aditionalServices) {
        super(controlNumber, vacantNumber, aditionalServices);
    }

    public int getPrice(int hours) {
        if (hours <= 1)
            return Van.INITIAL_PRICE;
        else 
            return Van.INITIAL_PRICE + (hours * 5);
    }

}
