import java.util.*;
public class tempo {
        public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        int a[]={4,79,10,49,49,7};
        int max=0,smax=0;  //49 10
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i]&&smax<max)
            {
                smax=max;
                max=a[i];
            }
            else if(max>a[i]&&smax<a[i])
            {
                smax=a[i];
            }
            else if(max<a[i])
            {
               max=a[i];
            }
        }
        System.out.println(smax);
        
        
        
        
        
        
        
        
        
        
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]);
        System.out.println('a'-'a');

      
















        // int[] b=new int[6];
        // for(int i=0;i<b.length;i++){
        //     b[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(b));
        // for(int i=0;i<b.length;i++){
        //     System.out.println(b[i]);
        // }
    }
}


