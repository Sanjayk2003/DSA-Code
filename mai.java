
import java.util.*;
public class mai {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    int st=0;
    int end=arr.length-1;
    while(st<end)
    {
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        end--;
        st++;
    }
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        if(i%2==0)
        {
        sum+=arr[i];
    }
}                                                                                 System.out.println(sum);
}

    }



