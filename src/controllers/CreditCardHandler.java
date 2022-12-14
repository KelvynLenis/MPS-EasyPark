package controllers;

public class CreditCardHandler extends BaseCustomerPayment {
    @Override
    public CustomerPayment handle(CustomerPayment payment) {
        if (payment.methodPayment == "credito") {
            payment.acceptPayment = true;
            System.out.println("O pagamento por cartão de crédito foi aprovado!");

            return payment;
        }

        return super.handle(payment);
    }
}