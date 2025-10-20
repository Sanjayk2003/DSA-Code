import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TwoSum {
    static void Method1(int arr[],int target){
       
        LinkedHashMap<Integer,Integer> m=new LinkedHashMap<>();;
        int sol[]=new int[2];
       
        for(int i=0;i<arr.length;i++)
        {
           if(!m.containsKey(target-arr[i]))
           {
            m.put(arr[i], i);
           }
           else{
            sol[1]=arr[i];
            sol[0]=arr[m.get(target-arr[i])];
           }
        }
        System.out.println(sol[1]+" "+sol[0]);
        
    }
    static int[] Method2(int arr[],int target)
    {
        int st=0;
        int end=arr.length-1;
        int sol[]={0,0};
        Arrays.sort(arr);
        while(st<end)
        {
         int sum=arr[st]+arr[end];
         if(sum==target)
         { 
            sol[0]=arr[st];
            sol[1]=arr[end];
            break;
         }
         else if(sum>target)
         {
            end--;
         } 
         else
         {
        st++;
         }
        }
    return sol;
    }
    public static void main(String[] args) {
        int arr[]={1,2,10,22,5,8,9};
        Method1(arr, 10);
       System.out.println(Arrays.toString(Method2(arr, 10)));
       System.out.println(Arrays.toString(arr));
    }
}
