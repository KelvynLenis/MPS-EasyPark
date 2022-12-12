package models.vehicle;

public class PriceVan implements PriceBehaviour {
    
    private static final int INITIAL_PRICE = 10;
    
    @Override
    public int getPrice(int hours) {
        return INITIAL_PRICE + (hours * 5);
    }
}
