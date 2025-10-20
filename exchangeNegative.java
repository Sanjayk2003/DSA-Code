import java.util.Arrays;

public class exchangeNegative {
    public static void main(String[] args) {
        int arr[]={-1,3,4,6 ,7,-1,-3,-2};
        int i=0;
        int j=1;
        while(j!=arr.length-1)
        {
            if(arr[i]<0)
            {
               i=i+2; 
            }
            if(arr[j]>=0)
            {
                j=j+2;
            }
            if(arr[i]>=0&&arr[j]<0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
