import java.util.*;
class Maxsub
{
    static void maxSubstring(int arr[])
    {
     int current=0;
     int max=0;
     for(int i=0;i<arr.length;i++){
      int temp =current+arr[i];
      if(temp>arr[i])
      current=temp;
      else
      current=arr[i];
      if(current>max)  
      max=current;
     }
     System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        maxSubstring(arr);

    }
}