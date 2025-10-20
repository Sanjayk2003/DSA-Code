import java.util.Arrays;

public class removeRepeatedElement {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,2,2,2,3,3,3,4,4,4};
        int i=1;
        for(int j=1;j<arr.length-1;j++)
        {
            if(arr[j]!=arr[j-1])
            {
                arr[i]=arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
