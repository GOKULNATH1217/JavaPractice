import java.util.*;
abstract class InnerShapeCalculator {

    abstract public void area();
    abstract public void display();
    
}
class Circle extends InnerShapeCalculator{
    private double radius;
    private double area;
    Circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        area = Math.PI*(Math.pow(this.radius,2));
    }
    @Override
    public void display()
    {
        System.out.println("area of circle = "+area);
    }
}
class Rectangle extends InnerShapeCalculator{
    private int length;
    private int breadth;
    private int area;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void area()
    {
        area=length*breadth;
    }
    @Override
    public void display()
    {
        System.out.println("area of rectangle = "+ area);
    }
}
public class ShapeCalculator {
    public static void main(String[] args) {
        InnerShapeCalculator in;
        Scanner sc = new Scanner(System.in);
        System.out.println("TO CALCULATE AREA FOR CIRCLE PRESS 1");
        System.out.println("TO CALCULATE AREA FOR RECTANGLE PRESS 2");
        int input=sc.nextInt();
        switch (input) {
            case 1:
                System.out.print("ENTER THE RADIUS : ");
                double radius=sc.nextDouble();
                in=new Circle(radius);
                in.area();
                in.display();
                break;
            case 2:
                System.out.print("ENTER THE LENGTH AND BREADTH : ");
                int length=sc.nextInt();
                int breadth=sc.nextInt();
                in=new Rectangle(length, breadth);
                in.area();
                in.display();
                break;
            default:
                System.out.println("ENTER THE INPUT CORRECTLY");
                break;
        }
   }
}
