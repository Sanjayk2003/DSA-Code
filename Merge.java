import java.util.Arrays;

public class Merge {
    static void sortArray(int arr[],int temp[],int low,int high)
    {
        if(low<high){
      int mid=low+(high-low)/2;
      sortArray(arr,temp,low,mid);
      sortArray(arr, temp, mid+1, high);
      Merge(arr,temp,low,mid,high);
      System.out.println(Arrays.toString(arr));
        }

    }
    static void Merge(int arr[],int temp[],int low,int mid,int high){
      for(int i=low;i<=high;i++)
      {
       temp[i]=arr[i];
      }
      int i=low,j=mid+1,k=low;

      while(i<=mid&&j<=high){
        if(temp[i]<temp[j])
        {
            arr[k]=temp[i];
            i++;
        }
        else{
            arr[k]=temp[j];
            j++;
        }
        k++;
      }
      while(i<=mid){
        arr[k]=temp[i];
        k++;
        i++;
      }

    }
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4,9,7,6,8,11,14,10,13,12};
        //int temp[]=new int[arr.length];
        sortArray(arr,new int[arr.length],0,arr.length-1);
        System.out.println(Arrays.toString(arr)); 
    }
}
