
import java.util.*;
class Student{
    public String rollNumber;
    private double cgpa;
    Student(String rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    public void setCgpa(double cgpa)
    {
        this.cgpa=cgpa;
    }
    public double getCgpa()
    {
        return cgpa;
    }
}
class Student1 extends Student{
    Student1(String rollNumber)
    {
        super(rollNumber);
    }
    void display()
    {
        System.out.println(rollNumber);
        System.out.println(getCgpa());
    }
}
public class AccessSpecifiersPriavte {
    public static void main(String[] args) {
        Student1 s1 = new Student1("24CS077");
        s1.setCgpa(8);
        s1.display();
    }
}
