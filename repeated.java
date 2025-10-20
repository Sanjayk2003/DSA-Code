import java.util.Arrays;
import java.util.Scanner;

public class repeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,4,6,3,4,8,5,9,9};
        for(int i=0;i<arr.length-1;i++)
        {
          for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i]==arr[j])
            {
                arr[j]=-1;
            }
          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
