import java.util.Arrays;

class Graph {

   int adj[][];
   int V;
   int E;

   Graph(int n)
   {
    this.V=n;
    this.E=0;
    this.adj=new int[n][n];
   }

   void add(int v,int e)
   {
    adj[v][e]=1;
    adj[e][v]=1;
    E++;
   }
   
   public String toString()
   {
    StringBuilder s=new StringBuilder();
    s.append("vertices: "+V+"\n Edges: "+ E+"\n");
    for(int i=0;i<V;i++)
    {
s.append(i+" : ");
        for(int k:adj[i]){
            s.append(k+" ");
        }
        s.append("\n");
    }
    return s.toString();
   }
    
}
public class GraphImplementation {
    public static void main(String[] args) {
        Graph g=new Graph(4);
        g.add(0,1);
        g.add(1,2);
        g.add(2,3);
        g.add(3,0);

        System.out.println(g.toString());
    }
}
