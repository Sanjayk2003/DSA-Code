import java.util.Arrays;

public class DutchNationalFlagProb {
    static void solve(int arr[])
    {
        int i = 0;int j=0; int k = arr.length-1;

        //System.out.println(Arrays.toString(arr));
        while ( i<=k)
        {
         if( arr[i] == 0)
         {
            
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
         }
         else if(arr[i] == 1)
         {
            i++;
         }
         else if( arr[i] == 2)
         {
             int temp=arr[i];
             arr[i] = arr[k];
             arr[k] = temp;
            k--;
         }
         
        }
        //System.out.println(Arrays.toString(arr));
    }
        static void swap(int arr[],int i, int j)
        {
        }
    
    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,2,1,0}; 
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
