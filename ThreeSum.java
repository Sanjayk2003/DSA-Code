import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={2,4,3,7,1,0};
        int target=6;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int j=i+1;;
            int k=arr.length-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target)
                {
                    System.err.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;
                    k--;
                }
                if(sum<target)
                {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }
}
