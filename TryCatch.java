import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int size,i,input;
            System.out.println("ENTER THE SIZE OF THE ARRAY : ");
            size=sc.nextInt();
            int array[]=new int[size];
            for(i=0;i<size;i++)
            {
                System.out.println("ENTER THE ELEMENT : ");
                array[i]=sc.nextInt();

            }
            System.out.println("ENTER THE INDEX FROM 0 TO " + (size-1));
            input=sc.nextInt();
            System.out.println(array[input]);
        }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    finally{
        System.out.println("PROGRAM ENDED");
    }
}

}
