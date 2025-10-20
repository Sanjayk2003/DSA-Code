public class matrixSearch {
     static void search (int arr[][],int a,int n)
     {
        int i=0;
        int j=n-1;
        while(i<n&&j>=0)
        {
            if(arr[i][j]==a)
            {
                System.out.println(i+" "+j);
                return;
            }
            if(arr[i][j]>a)
            {
                j--;
            }
            if(arr[i][j]<a)
            {
                i++;
            }
        }
        System.out.println("Notfound");
     }
    public static void main(String[] args) {
        int arr[][]={{10,15,25,40},
                     {12,16,27,45},
                     {15,17,30,49},
                     {45,67,89,90}};
      search(arr,10,4);  
      
    }
}
