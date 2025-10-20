import java.util.Arrays;

public class AddtoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10};
        int n=arr1.length;
        int m=arr2.length;
        int result[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j])
            {
                result[k]=arr1[i];
                i++;
            }
            else
            {
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            result[k]=arr1[i];
            i++;k++;
        }
        while(j<n)
        {
            result[k]=arr2[j];
            j++;k++;
        }
        System.out.println(Arrays.toString(result));
    }
}
