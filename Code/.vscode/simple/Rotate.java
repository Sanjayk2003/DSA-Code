import java.util.*;

public static class Rotate{

     static void maxSubstring(int arr[]){
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
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={0,1,2,-1,5,-6,7};
        maxSubstring(arr);

    }
}