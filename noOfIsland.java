public class noOfIsland {
    static void isLand(int arr[][],int n){
      boolean visited[][]=new boolean[n][n] ;
      int count=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
            if(arr[i][j]==1&& !visited[i][j]){
            Dfs(arr,visited,i,j);
            count++;
            }
        }
    }
    System.out.print(count);
    }
    static void Dfs(int arr[][],boolean visited[][],int i,int j){

        if(i>=arr.length||j>=arr.length||i<0||j<0||visited[i][j]||arr[i][j]==0)
        {
            return;
        }
        visited[i][j]=true;
        Dfs(arr,visited,i+1,j);
        Dfs(arr,visited,i,j+1);
        Dfs(arr,visited,i-1,j);
        Dfs(arr,visited,i,j-1);
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,0,0},
                     {1,0,0,0},
                     {0,0,1,0},
                     {0,0,0,1}};

        isLand(arr,arr.length);             
    }
}
