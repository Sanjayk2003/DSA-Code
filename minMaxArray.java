import java.util.Arrays;

public class minMaxArray {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8,9};
        int[] arr1=new int[arr.length];
        int j=0,k=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr1[i]=arr[j]>arr[k]?arr[j]:arr[k];
            }
            else{
                arr1[i]=arr[j]<arr[k]?arr[j]:arr[k];
                j++;k--;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
