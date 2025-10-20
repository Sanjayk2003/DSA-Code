import java.util.Arrays;

public class quickSort {
    static void sort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }

    }
    static int partition(int arr[],int low,int high)
    {
        int i=0;
        int j=0;
        int pivot=arr[high];
        while(i<=high)
        {
            if(arr[i]<=pivot){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            }
            i++;
        }
        return j-1;
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4,9,7,6,8,11,14,10,13,12};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
