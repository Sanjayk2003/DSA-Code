import java.util.Arrays;

public class Fibanocci {
    static int method1(int n)
    {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        int left=method1(n-1);
        int right=method1(n-2);
        return left+right;
    }
    static int[] method2(int n)
    {
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    static int usingDynamic(int n,int arr[])
    {
        if(arr[n]==0){
           if(n<2){
              arr[n]=n;
        }
        else{
        int left=usingDynamic(n-1, arr);
        int right=usingDynamic(n-2, arr);
        arr[n]=right+left;
        System.out.println(arr[n]);
        }
    }
     return arr[n];
      }
    
    public static void main(String[] args) {
        System.out.println(method1(6));
        System.out.println(Arrays.toString(method2(6)));
        System.out.println(usingDynamic(10, new int[10+1]));
        int arr[]=new int[10];
        
    }

}
