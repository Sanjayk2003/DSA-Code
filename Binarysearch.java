
public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2};
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            
            if(arr[mid+1]>arr[mid]){
                System.out.println("hh");
                st=mid+1;
            }
            else{
            end=mid-1;
            System.out.println("jj");
            }
        }
        System.out.println(arr[end]);
    }
}
