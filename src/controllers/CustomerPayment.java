package controllers;

/**
 * CustomerPayment
 */
public class CustomerPayment {
    protected String methodPayment;
    public Boolean acceptPayment = false;
    
    public CustomerPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }
}