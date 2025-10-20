import java.util.Arrays;

public class MaxMinOfSortedArray {

    public static void main(String[] args) {
        int arr[]={2,3,5,6,8};
        int i=0;
        int j=arr.length-1;
        int arr1[]=new int[j+1];
        for(int k=0;k<arr.length;k++)
        {
            if(k%2==0)
            {
                arr1[k]=arr[j];
                j--;
            }
            else{
                arr1[k]=arr[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
