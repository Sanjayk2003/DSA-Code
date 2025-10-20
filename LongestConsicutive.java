import java.util.Arrays;
import java.util.HashSet;

public class LongestConsicutive {
    public static void main(String[] args) {
        int arr[]={100,99,4,200,1,2,3};
        HashSet<Integer> set=new HashSet(Arrays.asList(arr));
        int c=0;
        for(int k1:arr)
        {
            int c1=0;
           int k=k1;
            while(set.contains(k))
            {
             k+=1;
            c1++;
            System.out.println(k);
            }
            if(c1>c)
            c=c1;
        }
        System.out.println(c);
    }
}
