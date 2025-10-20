import java.util.LinkedList;

public class mergeInterval {

    LinkedList<Node> l;
    mergeInterval()
    {
        l=new LinkedList<>();
    }
     public class Node{
        private int st;
        private int end;

        Node(int st,int end){
            this.st=st;
            this.end=end;
        }
    }
    void add(int a,int b)
    {
     l.add(new Node(a,b));
    }
    void display()
    {
      for(Node n:l){
        System.out.println(n.st+"  "+n.end);
      }
    }
     LinkedList<Node> OverLap(LinkedList<Node> n )
    {
        if(n==null||n.isEmpty())
        {
            return new LinkedList<>();
        }
        n.sort((a,b)->Integer.compare(a.st,b.st));
        
       Node node=n.get(0);
       LinkedList<Node> l1=new LinkedList<>();
       int st=node.st;
       int end=node.end; 

       for(int i=1;i<n.size();i++)
       {
        Node c=n.get(i);
        if(c.st<=end)
        {
            end=Math.max(end, c.end);
        }
        else{
            l1.add(new Node(st, end));
            st=c.st;
            end=c.end;
        }

       }
       l1.add(new Node(st,end));

      return l1;
    }
    void displayList(LinkedList<Node> n)
    {
    for(Node k:n){
        System.out.println("{"+k.st+" "+k.end+"}");
    }
    }

    LinkedList<Node> insertNode(LinkedList<Node> l,Node newnode)
    {
        if(l==null||l.isEmpty())
        return l;
        LinkedList<Node> result=new LinkedList<>();
        int i=0; //pointer
        while(i<l.size()&&newnode.st>l.get(i).end){  // add nodes smaller than the new node
            result.add(l.get(i));
            i++;

        }
        while(i<l.size()&&newnode.end>=l.get(i).st){ // to merge nodes
         Node current=l.get(i);
         newnode.st=Math.min(newnode.st,current.st);
         newnode.end=Math.max(newnode.end,current.end);
         i++;
        }
        result.add(newnode);
        while(i<l.size())  // add remaining nodes
        {
         result.add(l.get(i));
         i++;
         
        }

     return result;
    }

    public static void main(String[] args) {
        int[][] arr={{0,1},{3,5},{6,7},{9,10}};
        mergeInterval m=new mergeInterval();
        for(int i=0;i<arr.length;i++)
        {
            m.add(arr[i][0],arr[i][1]);
        }
        m.display();
        System.out.println("_________________________________________");
        LinkedList<Node> o=m.OverLap(m.l);
        m.displayList(o);
        System.out.println("________________________________________________");
        m.displayList(m.insertNode(m.l,m.new Node(2, 7)));
        
    }
}