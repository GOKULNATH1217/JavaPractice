import java.util.*;
public class Exception_handling{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num1,num2,result;
            System.out.println("ENTER THE NUMBERS :");
            num1=sc.nextInt();
            num2=sc.nextInt();
            result=num1/num2;
            System.out.println("RESULT =" +result);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("CODED ENDED");
        }
    }
}