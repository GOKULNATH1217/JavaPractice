import java.util.*;
public class String_reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            s1+=c;
        }
        System.out.println(s1);
    }
}