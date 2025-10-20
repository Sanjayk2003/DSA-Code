import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Occurance {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ertyuytrert";
        String s1[]=s.split("");
        String s9="";
        LinkedHashMap<String,Integer> m=new LinkedHashMap<>();
        //m.put("s",1);
        for(int i=0;i<s.length();i++)
        {
         if(m.containsKey(s1[i]))
         {
            m.put(s1[i],m.get(s1[i])+1);
         }
         else{
            s9+=s1[i];
            m.put(s1[i],1);
         }
        }
        String s10[]=s9.split("");
        System.out.println(m);
        for(int i=0;i<m.size();i++)
        {
            System.out.print(s10[i]);
        System.out.print(m.get(s10[i]));
        }
        System.out.println();
        System.out.println("sarkar");
        System.out.println(m);
        for(int k:m.values())
        {
            System.out.print(k+" ");
        }
        System.out.println(m.keySet());
        
    }
}
