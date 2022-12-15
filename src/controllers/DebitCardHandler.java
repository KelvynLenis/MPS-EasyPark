package controllers;

/**
 * DebitCardHandler
 */
public class DebitCardHandler extends BaseCustomerPayment {
    @Override
    public CustomerPayment handle(CustomerPayment payment) {
        if(payment.methodPayment.equals("debito")) {
            payment.acceptPayment = true;
            System.out.println("O pagamento por cartão de débito foi aprovado!");

            return payment;
        }

        return super.handle(payment);
    }

}