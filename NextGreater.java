import java.util.*;
public class NextGreater {
    int[] NextGreaterarr(int arr[])
    {                                      //6 4 9 4 8 6 10
        int result[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        int count=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&s.peek()<=arr[i]){
                 s.pop();
            }
        
            if(s.isEmpty())
            {
             result[i]=-1;
             count++;
            }
            else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
      return result;
    }



    public static void main(String[] args) {
        NextGreater n=new NextGreater();
        int arr[]={8,3,6,8,35,3};
        System.out.println(Arrays.toString(n.NextGreaterarr(arr)));
        

    }
    
}