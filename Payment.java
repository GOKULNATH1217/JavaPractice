class payment1{
    void pay()
    {
        System.out.println("PAYMENT PAYED");
    }
}
class Upi extends payment1{
    @Override
    void pay()
    {
        System.out.println("UPI PAYED");
    }
}
class CreditCard extends payment1{
    @Override
    void pay()
    {
        System.out.println("CREDITCARD PAYED");
    }
}
class Cash extends payment1{
    @Override
    void pay()
    {
        System.out.println("CASH PAYED");
    }
}
public class Payment {
    public static void main(String[] args) {
        payment1 p;
        p=new Upi();
        p.pay();
        p=new CreditCard();
        p.pay();
        p=new Cash();
        p.pay();
    }
}
