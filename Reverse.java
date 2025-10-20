import java.util.*;

public class Reverse {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[sc.nextInt()];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
       int st=0;
       int end=arr.length-1;
       while(st<end)
       {
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        st++;
        end--;
       }
       System.out.println(Arrays.toString(arr));
    }
    
}
