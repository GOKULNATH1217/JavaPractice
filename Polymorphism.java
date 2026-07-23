class Vehicle{
    void start()
    {
        System.out.println("ENGINE START");
    }
}
class Car extends Vehicle{
    void start()
    {
        System.out.println("CAR ENGINE STARTED");
    }
}
class Bike extends Vehicle{
    void start()
    {
        System.out.println("BIKE ENGINE STARTED");
    }
}
class Lorry extends Vehicle{
    void start()
    {
        System.out.println("BIKE ENGINE STARTED");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Vehicle v;
        v=new Car();
        v.start();
        v=new Bike();
        v.start();
        v=new Lorry();
        v.start();
    }
}