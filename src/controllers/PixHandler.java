package controllers;

public class PixHandler extends BaseCustomerPayment{
    @Override
    public CustomerPayment handle(CustomerPayment payment) {
        if(payment.methodPayment == "pix") {
            payment.acceptPayment = true;
            System.out.println("O pagamento por pix foi aprovado!");

            return payment;
        }        

        
        return super.handle(payment);
    }
}
