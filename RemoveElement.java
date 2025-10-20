import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int n=2;
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==n)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              j--;
            }
            if(arr[j]==2)
            {
                j--;
            }
            
                i++;
        }
        System.out.println(Arrays.toString(arr));
    }
   
}
