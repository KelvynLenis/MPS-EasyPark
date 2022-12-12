package models.vehicle;

public class PriceMotorcycle implements PriceBehaviour {
    
    private static final int INITIAL_PRICE = 5;
    
    @Override
    public int getPrice(int hours) {
        return INITIAL_PRICE + (hours * 2);
    }
}
