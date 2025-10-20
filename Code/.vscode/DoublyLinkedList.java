public class DoublyLinkedList {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addF(10);
        
    }
    
}
class Node{
    int data;
    Node next;
    Node tail;
    Node(int data)
    {
        this.data=data;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int length;
    void addF(int d)
    {
        Node newn=new Node(d);
        if(head==null)
        {
            head=newn;
            tail=newn;
        }
    }
    
    
}
