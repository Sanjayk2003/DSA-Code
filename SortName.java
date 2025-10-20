import java.util.*;

public class SortName {
    static char[] Solution(String s){
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length-i-1;j++)           
            {
             if(c[j+1]<c[j])
             {
                char t=c[j];
                c[j]=c[j+1];
                c[j+1]=t;
             }
            }
        }
        System.out.println();
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println();
        System.out.println(Solution(s));

    }
}
