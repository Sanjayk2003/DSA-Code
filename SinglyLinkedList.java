class Node{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        next=null;
        
    }
}
class LinkedList
{
public Node head=null;

void add(int data)
{
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node current=head;
            while (current.next != null) {
            current = current.next;
            }
        current.next = newNode;
    }
}
void display() //to display the list
{
if(head==null)
{
System.out.println("empty");
}
else{
    System.out.println();
    Node current=head;
    while(current!=null)
    {
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.print("Null");
}
}
void deleteFirst()
{
    System.out.println();
    Node current=head;
    head=current.next;
    current=null;
}

void insert(int p,int v)
{
    Node n=new Node(v);
    if(p==1)
    {
      n.next=head;
      head=n;
    }
    else
    {
    Node current=head;
    Node previous=null;
    int count=1;
    while(count<p)
    {
        previous=current;
        current=current.next;
        count++;
    }
    previous.next=n;
    n.next=current;
    }
}
void deleteAt(int a)
{
    if(a==0)
    {
        deleteFirst();
    }
    else{
       Node current=head;
       Node previous=null;
       int cout=1;
       while(cout<a)
       {
        previous=current;
        current=current.next; 
        cout++;
       }
       previous.next=current.next;
       current=null;
    }
}
void deleteLast(){
Node current=head;
Node previous=null;
while(current.next!=null)
{
    previous=current;
    current=current.next;
}
previous.next=null;
current.next=null;
}
void reverse(){
    Node current=head;
    Node previous=null;
    Node next=null;
    while(current!=null)
    {
        next=current.next;
        current.next=previous;
        previous=current;
        current =next;
    }
    head=previous;
}
int fromLast(int n){  //To return the value of the index from the last;
if(head==null)
{
    return head.data;
}
else{
   try{
    Node mainp=head;
    Node refp=head;
    int count=0;
    while(count<n)
    {
        refp=refp.next;
        count++;
    }
    while(refp!=null)
    {
        mainp=mainp.next;
        refp=refp.next;
    }

    return mainp.data;
   }catch(Exception e){return 0;}
}
}
void hash()
{
  Node current=head;
  while(current!=null&&current.next!=null)
  {
      if(current.data==current.next.data){
      current.next=current.next.next;
      }
      else{
          current=current.next;
      }
  }
}
void hashInsert(int d)
{
  Node n=new Node(d);
  Node current=head;
  Node temp=null;
  while(current!=null&&current.data<=n.data)
  {
      temp=current;
      current=current.next;
  }
  n.next=current;
  temp.next=n;
}
void removeValue(int d)
{
  Node current=head;
  Node previous=null;
  if(current!=null&&current.data==d)
  {
      head=current.next;
  }
  else{
  while(current!=null&&current.data!=d)
  {
      previous=current;
    current=current.next;  
  }
  previous.next=current.next;
  current=null;
  }
  
}
boolean isContains(int d)
{
  Node current=head;
  while(current!=null)
  {
      if(current.data==d)
      {
          return true;
      }
      current=current.next;
  }
  return false;
}
boolean isLoop()
{
  Node fast=head;
  Node slow=head;
  while(fast!=null&&fast.next!=null)
  {
      fast=fast.next.next;
      slow=slow.next;
      if(fast==slow)
      {
          return true;
      }
  }
  return false;
}
Node merge(LinkedList d)
{   Node b=d.head;
Node a=head;
Node dummy=new Node(0);
Node temp=dummy;
while(a!=null&&b!=null)
{
    if(a.data<b.data)
    {
        temp.next=a;
        a=a.next;
    }
    else
    {
        temp.next=b;
        b=b.next;
    }
    temp=temp.next;
}
if(a!=null)
{
   temp.next=a; 
}
else
{
    temp.next=b;
}
return dummy.next;
}

int replace(int v,int r )
{
   Node current=head;
   Node previous=null;
   Node n=new Node(r);
   int count =0;
   try{
   while(v!=current.data)
   {previous=current;
     current=current.next;  
     count++;
   }
   if(current.data==v)
   {
   previous.next=n;
   n.next=current.next;
   return count;
   }
       
   }catch(Exception e){System.out.println("Null Pointer");}
   return -1;
}
void clear(){
   head=null;
}
  Node addition(LinkedList c)
  {
    Node a=head;
    Node b=c.head;
    Node Dummy=new Node(0);
    Node o=Dummy;
    int carry=0;
    while(a!=null||b!=null)
    {
     int a1=(a!=null)?a.data:0;
     int a2=(b!=null)?b.data:0;
     int d=carry+a1+a2;
     carry=d/10;
     int f=d%10;                           
     o.next=new Node(f); 
     a=(a!=null)?a.next:a;
     b=(b!=null)?b.next:b;
     o=o.next;
    }                        
    if(carry!=0)
    {
        o.next=new Node(carry);
    }
    return Dummy.next;
  }
  void delMid()
  {
    if(head.next==null)
    {
        head=null;
    }
    Node slow=head;
    Node fast=head;
    while(fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;
    }
    Node temp=slow.next;
    slow.next=temp.next;
    temp=null;
  }

}

public class SinglyLinkedList
{
public static void main(String[] args) {
    System.out.println("Hello World");
    LinkedList l=new LinkedList();
    l.add(103);
    l.add(20);
    l.add(40);
    l.add(50);
    
    l.display();
    l.deleteFirst();
    
    l.insert(1,0);
    l.insert(3,6);
    
    l.display();
    
    l.deleteAt(3);
    
    l.display();
    
    l.deleteLast();
    
    l.display();
    l.add(40);
    l.hash();
    l.display();
    l.hashInsert(23);
    l.display();
    l.removeValue(0);
    l.display();
    System.out.println("\n"+l.fromLast(2));
    System.out.println(l.isContains(23));
    System.out.println(l.isLoop());
    l.display();
    LinkedList l2=new LinkedList();
    l2.add(1);
    l2.add(30);
    l2.add(79);
    l2.add(100);
    LinkedList l3=new LinkedList();
    l3.head=l.merge(l2);
    l3.display();
    System.out.println("\n"+l3.replace(30,60));
    l3.replace(30,60);
    l.clear();
    l2.clear();
    l3.clear();
    l.add(9);
    l.add(9);
    l.add(9);

    l2.add(9);
    l2.add(9);
    l2.add(9);
    l2.add(9);
    l2.add(9);
    l3.head=l.addition(l2);
    l3.display();
    System.out.println(l3.fromLast(6));

}
}
