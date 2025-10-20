import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=0;
        int end=s.length()-1;
        while(st<end)
        {
            if(s.charAt(st)!=s.charAt(end)){
                System.out.println(false);
                return;
            }
       st++;
       end--;
        }
        System.out.println(true);
    }
}
