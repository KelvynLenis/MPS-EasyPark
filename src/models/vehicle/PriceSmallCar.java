package models.vehicle;

public class PriceSmallCar implements PriceBehaviour {

    private static final int INITIAL_PRICE = 7;
    
    @Override
    public int getPrice(int hours) {
        return INITIAL_PRICE + (hours * 4);
    }
}
