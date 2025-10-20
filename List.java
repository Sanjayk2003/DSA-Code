import javax.sql.rowset.spi.SyncResolver;

class List {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addB(10);
        l.addB(67);
        l.addB(90);
        l.length();
        l.displayF();
        l.displayB();
        l.deleteFirst();
        System.out.println(l.length());
        l.replace(3, 45);
        
    }
    
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
        
    }
}
class LinkedList{
    Node head;
    Node tail;
    int length;
    // LinkedList()
    // {
    //     this.head=null;
    //     this.tail=null;
    //     this.length=0;
    // }
    void addF(int d)
    {
        Node newn=new Node(d);
        if(head==null)
        {
            head=newn;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newn;
            newn.prev=current;
        }
        tail=newn;
        length++;
    }
    void addB(int d)
    {
        Node newn=new Node(d);
        if(tail==null)
        {
            tail=newn;
        }
        else{
            Node current=tail;
            while(current.prev!=null)
            {
             current=current.prev;
            }
            current.prev=newn;
            newn.next=current;
        }
            head=newn;

        
    }
    boolean isEmpty()
    {
        return length==0;
    }
    int length()
    {
        return length;
    }
    void displayF()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("Null");
    }
    void displayB()
    {
        Node current =tail;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.prev;
        }
        System.out.println("Null");
    }
    int delete(int d)
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("null");
        }
        else{
            while(current.next!=null)
            {
                if(current.next.data==d){
                 current.next=current.next.next;
                 current.next.prev=null;
                 current.next.next=null;

                }
            }
        }
       return -1; 
    }
    int deleteFirst()
    {
        LinkedList l=new LinkedList();
        if(l.isEmpty())
        {
            throw new NullPointerException();
        }
        else if(head==tail){
            tail=null;
        }
        Node temp=head;
        head=head.next;
        temp.prev=null;
        temp.next=null;

        return temp.data;
    }
    void replace(int pos,int data)
    {
     Node n=new Node(data);
     Node current=head;






     
     if(head==null)
     {
      throw new NullPointerException();
     }
     else{
        int count=0;
        while(count<pos)
        {
            current=current.next;
        }


     }
    }
    
    
}
