import java.util.LinkedList;
public class SlidingWindow {
    public static void main(String[] args) {
        int arr[]={2,7,3,5,8,1};
        int k=3;
        int max=0,sum=0;
        int st=0;
        for(int i=0;i<arr.length ;i++)
        {
            sum+=arr[i];
            if(i>= k-1){
                max=Math.max(max, sum);
                sum-=arr[st];
                st++;
            }
        }
        System.out.println(max);
    }
}
