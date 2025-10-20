class LinkedList{

    Node head;
    int length;
    private class Node{
        int val;
        Node next;

        public Node(int val, LinkedList.Node next) {
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
        }
        System.out.print("End");
    }

}
public class Link {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addFirst(2);
        l.addFirst(1);
        l.display();
    }
}
