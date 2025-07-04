class Payments 
{
    public void processPayment()
    {
        System.out.println("Processing the payment.");
    }
}

class CreditCardPayment extends Payments
{
    @Override
    public void processPayment()
    {
        System.out.println("Credit Card Payment is Processing.");
    }
}

class UPIPayment extends Payments
{
    @Override
    public void processPayment()
    {
    System.out.println("UPI Payment is Processing");
    }
}

public class Payment 
{
    public static void main(String[] args) 
    {
        Payments payment = new Payments();
        CreditCardPayment creditcard = new CreditCardPayment();
        UPIPayment upi = new UPIPayment();

        payment.processPayment();
        creditcard.processPayment();
        upi.processPayment();
    }   
}