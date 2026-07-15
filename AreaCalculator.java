class Circle
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    void dispaly()
    {
        double r=Math.PI*(Math.pow(radius, 2));
        System.out.println("RADIUS of CIRCLE : "+r);
    }
}
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void display()
    {
        int area=length*breadth;
        System.out.println("AREA of RECTANGLE : "+area);
    }

}
class Square{
    int length;
    Square(int length)
    {
        this.length=length;
    }
    void disgplay()
    {
        int area=(int)(Math.pow(length, 2));
        System.out.println("AREA of SQUARE : "+area);
    }
}
public class AreaCalculater {
    public static void main(String[] args) {
        Circle c1=new Circle(2);
        Rectangle r1=new Rectangle(5,4);
        Square s1=new Square(4);
        c1.dispaly();
        r1.display();
        s1.display();
    }
}
