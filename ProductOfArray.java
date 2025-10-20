public class ProductOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int prod=1;
        for(int i=0;i<arr.length;i++)
        {
         prod*=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
         System.out.println(prod/arr[i]);
        }
    }
}
