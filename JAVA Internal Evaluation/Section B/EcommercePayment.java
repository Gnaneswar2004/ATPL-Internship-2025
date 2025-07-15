interface Payment {
    void pay();
}
class UPIPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying using UPI.");
    }
}

class CardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying using Card.");
    }
}

class CashOnDelivery implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using Cash.");
    }
}
public class EcommercePayment {
    public static void main(String[] args) {
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();
        Payment cash = new CashOnDelivery();

        upi.pay();
        card.pay();
        cash.pay();
    }
}
