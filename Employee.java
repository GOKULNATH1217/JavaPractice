import java.util.*;
class Details{
    protected String name;
    protected int id;
    protected int salary;
    protected String dept;
    Details(String name,int id,int salary,String dept)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.dept=dept;
    }
    void display()
    {
        System.out.println("Employee ID : "+ id);
        System.out.println("Employee Name : "+name);
        System.out.println("Department : "+dept);
        System.out.println("Basic Salary : "+salary);
    }
}
class Manager extends Details{
    private int bonus=0;
    private int totalSalary=0;
    Manager(String name,int id,int salary,String dept)
    {
        super(name,id,salary,dept);
    }
    public void setBonus(int amount)
    {
        bonus+=amount;
        totalSalary=(salary+bonus);
    }
    public int getBonus()
    {
        return bonus;
    }
    public int getTotalSalary()
    {
        return totalSalary;
    }
    void display()
    {
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : "+totalSalary);
    }
}
class Developer extends Details
{
    private String programmingLanguage;
    Developer(String name,int id,int salary,String dept)
    {
        super(name,id,salary,dept);
    }
    void programmingLanguage(String lang)
    {
        programmingLanguage=lang;
    }
    public String getProgrammingLanguage()
    {
        return programmingLanguage;
    }
    void display()
    {
        System.out.println("Programming Language : "+programmingLanguage);
    }
}
public class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m1 = new Manager("Goku",123,20000,"HR");
        m1.setBonus(2000);
        Developer d1 = new Developer("GOKUL", 12340, 15000, "IT");
        d1.programmingLanguage("JAVA");
        m1.display();
        d1.display();
    }
}