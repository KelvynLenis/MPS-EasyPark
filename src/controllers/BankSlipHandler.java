package controllers;

public class BankSlipHandler extends BaseCustomerPayment{

    @Override
    public CustomerPayment handle(CustomerPayment payment) {
        if(payment.methodPayment == "boleto") {
            payment.acceptPayment = true;

            System.out.println("O pagamento por boleto foi aprovado!");
            return payment;
        }

        return super.handle(payment);
    }
}
