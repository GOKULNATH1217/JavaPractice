class Car{
    protected String name;
    private int price;
    Car(String name)
    {
        this.name=name;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return this.price;
    }
}
class Bmw extends Car
{
    Bmw(String name)
    {
        super(name);
    }
    void display()
    {
        System.out.println(name);
        System.out.println(getPrice());
    }
}
public class AccessSpecifiresProtected {
    public static void main(String[] args) {
        Bmw b1 = new Bmw("BMW M8");
        b1.setPrice(20000);
        b1.display();
    }
    
}
