import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class GraphImplementationLinkedList {

    LinkedList<Integer>[] adj;
    int V;
    int E;
    int compId[];
    boolean isVisited[];      // to count component
    int count;    //to Count nunmber of components.
    GraphImplementationLinkedList(int n)
    {
        this.V=n;
        this.E=0;
        this.adj=new LinkedList[n];
        this.compId=new int[n];
        this.isVisited=new boolean[n];
        this.count=0;
        for(int i=0;i<n;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    void add(int e1,int e2)
    {
        adj[e1].add(e2);
        adj[e2].add(e1);
        E++;
    }
    String Show(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<V;i++)
        {
            s.append(i+" : ");
            for(int k:adj[i])
            {
              s.append(k+" ");  

            }
            s.append("\n");
        }
        return s.toString();
    }
    void BFS(int n){
        Queue<Integer> q=new LinkedList<>();
        boolean isTraversed[]=new boolean[V];
        q.offer(n);
        isTraversed[n]=true;
        while(!q.isEmpty()){
            int temp=q.poll();
            System.out.print(temp+" ");
            
                for(int k : adj[temp]){
                    if(!isTraversed[k]){
                        q.offer(k);
                        isTraversed[k]=true;
                    }
                }
        

        }
    }
    void DFS(int n)
       {
        Stack<Integer> s=new Stack<>();
        boolean[] isTraversed=new boolean[V];
        s.push(n);
        System.out.println();
        while(!s.isEmpty()){
            int temp=s.pop();
            if(!isTraversed[temp])
            {
                isTraversed[temp]=true;
                System.out.print(temp+" ");
                for(int k:adj[temp]){
                    if(!isTraversed[k]){
                        s.push(k);
                    }
                }
            }
        }
        System.out.println("");

        }
        void dfs(){
            boolean visited[]=new boolean[V];
            for(int i=0;i<V;i++)
            {
                if(!visited[i]){
                    dfs(visited,i);
                }
            }
        }
        void dfs(boolean visited[],int n){
          visited[n]=true;
          System.out.print(n+" ");
          for(int k:adj[n])
          {
            if(!visited[k]){
                dfs(visited,k);
            }
          }

        }
        void ComDfs()
        {
            for(int i=0;i<V;i++)
            {
                if(!isVisited[i])
                {
                  ComDfs(i);
                  count++;
                }
            }
            
        }
        void ComDfs(int n){
           isVisited[n]=true;
           compId[n]=count;
           for(int k:adj[n]){
            if(!isVisited[k])
            {
             ComDfs(k);
            }
           }

        }
        boolean isConnected(int n1,int n2){
            ComDfs();
            return compId[n1]==compId[n2];
        }
        int compCound(){
            ComDfs();
            return count;
        }


    
    
    public static void main(String[] args) {
        GraphImplementationLinkedList g=new GraphImplementationLinkedList(8);
        g.add(0,3);
        g.add(0,1);
        g.add(3,2);
        g.add(2,4);
        g.add(2,1); 
        
        System.out.println(g.Show());
        g.BFS(2);
        g.DFS(0);
        g.dfs();
        //g.ComDfs();
        System.out.println(g.isConnected(0, 6)+"     "+g.compCound());
        
    }
}
