class Student
{
    String name;
    int age;
    String dept;
    Student(String name,int age,String dept)
    {
        this.name=name;
        this.age=age;
        this.dept=dept;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(dept);
    }
}
public class Git {
    public static void main(String[] args) {
        Student s1=new Student("GOkulnath",20,"CSE");
        s1.display();
    }
}
