import java.util.Arrays;

public class copyof {
    static int[] vo(int n,int arr[])
    {
        int temp[]=new int[arr.length+n];
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=arr[i+n];
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,43,4};
         arr=vo(2,arr);
        System.out.println(Arrays.toString(arr)+arr.length);
        // for(int i=5;i<arr.length;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        arr=Arrays.copyOf(arr, 10);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
