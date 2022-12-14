package controllers;

public abstract class BaseCustomerPayment {
    protected BaseCustomerPayment nextHandler;

    public BaseCustomerPayment setNextHander(BaseCustomerPayment handler) {
        this.nextHandler = handler;
        return handler;
    }

    public CustomerPayment handle(CustomerPayment payment) {
        if(this.nextHandler != null) {
            return this.nextHandler.handle(payment);
        }

        return payment;
    }
}
