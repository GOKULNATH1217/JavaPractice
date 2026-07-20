class Students
{
    private String name;
    private int id;
    private double cgpa;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        if(id>0)
        this.id=id;
    }
    public void setCgpa(double cgpa)
    {
        if(cgpa>0&&cgpa<=10)
        this.cgpa=cgpa;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public double getCgpa()
    {
        return cgpa;
    }
    

}
public class Encapsulation{
    public static void main(String[] args) {
        Students s1=new Students();
        s1.setName("GOKU");
        s1.setId(123);
        s1.setCgpa(9.9);
        System.out.println(s1.getCgpa());
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        
    }
}