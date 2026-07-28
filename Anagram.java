public class Anagram{
    public static void main(String[] args) {
        String s1="Anagram";
        String s2="Naagam";
        int fre[]=new int[256];
        for(int i=0;i<s1.length()-1;i++)
        {
            fre[s1.toLowerCase().charAt(i)]++;
            fre[s2.toLowerCase().charAt(i)]--;
        }
        for(int i:fre)
        {
            if(i>0)
            {
                System.out.println("NOT ANAGRAM");
                return;
            }
        }
        System.out.println("ANAGRAM");
    }
}