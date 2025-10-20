import java.util.*;
class CApgemini{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // char c[]=s.toCharArray();
        // int st=0;
        // int end=c.length-1;
        // while(st<end)
        // {
        //     char temp=c[st];
        //     c[st]=c[end];
        //     c[end]=temp;
        //     st++;
        //     end--;
        // }
        // String s2=String.valueOf(c);
        // if(s.equals(s2))
        // {
        //  System.out.println(s+" is Palindrome");
        // }
        // else
        // System.out.println(s+" is not palindrome");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("0");
            }
            for(int k=i;k>=i;k-- ){
                    System.out.print(b);
            }
            for(int j=i;j<a-1;j++){
                System.out.print("0");
            }
            System.out.println(" ");

        }

    }
}