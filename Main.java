import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                third_max=second_max;
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max&&arr[i]!=max)
            {
                third_max=second_max;
                second_max=arr[i];
            }
            else if(arr[i]>third_max&&arr[i]!=second_max&&arr[i]!=max)
            {
                third_max=arr[i];
            }
        }
        System.out.println(second_max);
        System.out.println(third_max);
    }
}