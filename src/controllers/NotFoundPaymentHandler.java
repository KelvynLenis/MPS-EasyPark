package controllers;

public class NotFoundPaymentHandler extends BaseCustomerPayment{
    @Override
    public CustomerPayment handle(CustomerPayment payment) {
        System.out.println("Método de pagamento não encontrado!");

        return super.handle(payment);
    }
}
