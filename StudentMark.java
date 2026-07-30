import java.util.Scanner;
class Mark{
    private int mark;
    Mark(int mark)
    {
        this.mark=mark;
    }
    void result()
    {
        try{
            if(mark>=90 && mark <=100)
            {
                System.out.println("GRADE A");
            }
            else if(mark>=50 && mark <100)
            {
                System.out.println("GRADE B");
            }
            else if(mark>=0&& mark<100)
            {
                System.out.println("FAIL");
            }
            else if(mark<0||mark>100)
            {
                throw new ArithmeticException("INVALID MARK");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
public class StudentMark{
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int mark=sc.nextInt();
            Mark m = new Mark(mark);
            m.result();
        }
        catch(Exception e )
        {
            System.out.println(e);
        }
        finally{
            System.out.println("PROGRAM ENDED");
        }
    }
    
}