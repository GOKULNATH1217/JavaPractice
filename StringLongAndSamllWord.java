import java.util.*;
public class StringLongAndSamllWord{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String Array[]=s.split(" ");
        int max=Array[0].length();
        int min=Array[0].length();
        int maxIndex=0;
        int minIndex=0;
        for(int i=0;i<Array.length;i++)
        {
            if(Array[i].length()>max)
            {
                max=Array[i].length();
                maxIndex=i;
            }
            else if(Array[i].length()<min)
            {
                min=Array[i].length();
                minIndex=i;
            }
        }
        System.out.println(Array[maxIndex]);
        System.out.println(Array[minIndex]);
    }
}