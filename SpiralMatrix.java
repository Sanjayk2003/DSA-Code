import java.util.Scanner;

public class SpiralMatrix {
    static void spiral(int arr[][],int bottom,int right)
    {
      int left=0;
      int top=0;
      while(left<right&&top<bottom){
           for(int i=left;i<right;i++)
           {
            System.out.print(arr[top][i]+" ");
           }
           top++;
           for(int i=top;i<=bottom;i++)
           {
            System.out.print(arr[i][right-1]+" ");
           }
           right--;
           if(top<bottom)
           {
            for(int i=right-1;i>=left;i--)
            {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
           }
           if(left<right)
           {
            for(int i=bottom;i>=top;i--)
            {
                System.out.print(arr[i][left]+" ");
            }
            left++;
          }
      }
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
        int arr[][]={{1,2,3},
                     {5,6,7}
                    ,{9,10,11}
                    ,{13,14,15}};
        // for(int i=0;i<n1;i++)
        // {
        //     for(int j=0;j<n2;j++)
        //     {
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        spiral(arr,3,3);

    }
}
