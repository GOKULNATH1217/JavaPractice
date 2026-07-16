class Shape
{
    void draw()
    {
        System.out.println("Drawing ");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    void draw()
    {
        System.out.println("Drawing circle");
    }
    void area()
    {
        double r = Math.PI*(Math.pow(radius, 2));
        System.out.println("RADIUS OF CIRCLE : "+r);
    }
}
class Rectangle extends Shape{
    int length,breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
    void area()
    {
        System.out.println("AREA OF RECTANGLE: "+length*breadth);
    }
}
class Square extends Shape{
    int side;
    Square(int side)
    {
        this.side=side;
    }
    void draw(){
        System.out.println("Drawing Square");
    }
    void area()
    {
        System.out.println("AREA OF SQUARE : "+Math.pow(side, 2));
    }
}
public class Day2_project {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        Rectangle r1 = new Rectangle(10,5);
        Square s1 = new Square(5);
        c1.draw();
        r1.draw();
        s1.draw();
        c1.area();
        r1.area();
        s1.area();
    }
}
