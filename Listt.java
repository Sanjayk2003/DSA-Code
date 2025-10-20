import java.util.LinkedList;

public class Listt {
    public static void main(String[] args) {
        LinkedListt l=new LinkedListt();
        
        l.addFirst(2);
        l.addFirst(1);
        l.insertAt(2,2);
        l.display();
    }
}
class LinkedListt{

    Node head;
    int length;
    private class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
        
    }
    void addFirst(int n){
        length++;
        Node node=new Node(n);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val +"->");
            temp=temp.next;
        }
        System.out.print("End");
        
    }
    void insertAt(int val,int pos)
    {
        Node temp=head;
        if(pos==0)
        {
            insertAt(val,pos,temp);
            return;
        }
        insertAt(val,pos-1);

    }
    private Node insertAt(int val, int pos, Node temp)
    {
       if(temp==head)
       {
        temp=node;
        return temp;
       }
       Node node=new Node(val);
       node.next=temp.next;
       temp.next=node;

    }
     

}

