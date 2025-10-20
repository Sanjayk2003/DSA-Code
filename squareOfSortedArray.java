import java.util.Arrays;

public class squareOfSortedArray {
    public static void main(String[] args) {
        int arr[]={-10,-3,0,4,7,10,11};
        int i=0;
        int j=arr.length-1;
        int narr[]=new int[j+1];
        for(int k=j;k>=0;k--)
        {
          if(Math.abs(arr[i])>Math.abs(arr[j]))
          {
            narr[k]=arr[i]*arr[i];
            i++;
          }
          else
          {
            narr[k]=arr[j]*arr[j];
            j--;
          }
        }
        System.out.println(Arrays.toString(narr));
    }
}
