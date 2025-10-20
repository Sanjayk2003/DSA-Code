

public class KadanesAlgo {

    public static void main(String[] args) {
        int arr[]={18 ,-9,-10,7,10};
        int temp=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i]+temp;
            
            if(arr[i]>temp)
            {
             temp=arr[i];
            }

         if(temp>max)
         max=temp;
         //System.out.println(max);
            
        }
        System.out.println(max);
    }
}
