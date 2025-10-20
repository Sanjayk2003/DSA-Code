import java.util.Arrays;

public class squareMatrix {
   public static void main(String[] args) {
    int arr[]={-4,-1,0,5,10};
    int s=0,e=arr.length-1;
    int[] result=new int[e+1];
    for(int i=arr.length-1;i>=0;i--){
        if(Math.abs(arr[s])>Math.abs(arr[e]))
        {
         result[i]=arr[s]*arr[s];
         s++;
        }
        else
        {
            result[i]=arr[e]*arr[e];
            e--;
        }
    }
    System.out.println(Arrays.toString(result));
   } 
}
