class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        //this.next=null;
    }
}
class CircularLinkedList
{
    Node last;
    void addF(int data)
    {
    Node n=new Node(data);
        if(last==null)
        {
         last=n;
         //last=last.next;
        }
        else{
            n.next=last.next;
        }
            last.next=n;
            //last=last.next;
        
    }
    void addL(int data)
    {
        Node n=new Node(data);
        if(last==null)
        {
            last=n;
            last.next=last;
        }
        else{
            n.next=last.next;
            last.next=n;
            last=n;
        }
    }
    void display()
    {
        Node current=last.next;
        if(last==null)
        {
            System.out.println("null");
        }
        else{
            while(current!=last)
            {
           System.out.print(current.data+"-->");
           current=current.next;
            }
            System.out.println(last.data+"-->Null");
        }
    }

}
public class Circular {
    public static void main(String[] args) {
        CircularLinkedList c=new CircularLinkedList();
       c.addL(89);
       c.addL(90);
       c.addL(9);
       c.display();
    }
}
