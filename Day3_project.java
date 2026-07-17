class Car{
    String brand;
    int price;
    Car()
    {
        brand="Unkown";
        price=0;
    }
    Car(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    void display()
    {
        System.out.println(brand);
        System.out.println(price);
    }
}
class Employee{
    String name;
    int id;
    Employee()
    {
        name="Unknown ";
        id=0;
    }
    Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(id);
    }
}
class Rectangle{
    int length;
    int breadth;
    Rectangle()
    {
        length=0;
        breadth=0;
    }
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int area()
    {
        return length*breadth;
    }
}
public class Day3_project {
    public static void main(String[] args) {
        Car c1=new Car("BMW",120000);
        Employee e1=new Employee("GOKU",1234);
        Rectangle r1= new Rectangle(10, 5);
        Employee e2=new Employee();
        Rectangle r2 = new Rectangle();
        Car c2=new Car();
        c1.display();
        e1.display();
        System.out.println(r1.area());

        
    }
}
