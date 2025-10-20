import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Queue<String> q=new LinkedList<>();
    String s[]=new String[n];
    q.offer("1");
    for(int i=0;i<n;i++)
    {
        s[i]=q.poll();
        String s1=s[i]+"0";
        String s2=s[i]+"1";
       q.offer(s1);
       q.offer(s2);
    }
    System.out.println(Arrays.toString(s));
    System.out.println(Arrays.toString(q.toArray()));
}

}

