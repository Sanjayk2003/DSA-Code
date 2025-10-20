public class HashTabl {
    private HashNode bucket[];
    private int bucketLength;
    private int size;
    HashTabl()
    {
        this(10);
    }
    HashTabl(int n){
       this.bucketLength=n;
       this.bucket=new HashNode[n];
       this.size=0;
    }


    private class HashNode{
         private Integer key;
         private String value;
         HashNode next;
         HashNode(Integer key,String value )
         {
            this.key=key;
            this.value=value;

         }
    }
    boolean isEmpty()
    {
     return size==0;
    }
    int sizeOf()
    {
        return size;
    }
    void put(Integer key,String value ){
    Integer k=genKey(key);
    HashNode head=bucket[k];
    while(head!=null)
    {
        if(head.key.equals(key))
        {
         head.value=value;
         return;
        }
        head=head.next;
    }
    size++;
    head=bucket[k];
    HashNode node=new HashNode(key, value);
    node.next=head;
    bucket[k]=node;

    }

    Integer genKey(Integer n)
    {
        return n%bucketLength;
    }
    

    String get(Integer key)
    {
        if(key==null)
        throw new IllegalArgumentException("key is null");
        int k=genKey(key);
        HashNode head=bucket[k];
        while(head!=null)
        {
            if(head.key.equals(key)){
                return head.value;
         }
         head=head.next;
        }
        return null;
    }
        String remove(Integer key)
        {
            if(key==null)
            throw new IllegalArgumentException("give key");
            int k=genKey(key);
            HashNode head=bucket[k];
            HashNode prev=null;

            while(head!=null)
            {
                if(head.key.equals(key))
                {
                    break;
                }
                prev=head;
                head=head.next;
            }
            if(head==null){return null;}

            size--;

            if(prev!=null){
            prev.next=head.next;
            }
            else
            bucket[k]=head.next;

            return head.value;

        }

       
    
    



        public static void main(String[] args) {
            HashTabl h=new HashTabl();
            System.out.println(h.isEmpty());
            h.put(1, "hello");
            h.put(2, "hello");
            System.out.println(h.sizeOf());
            System.out.println(h.get(1));
            System.out.println(h.remove(1));
            System.out.println(h.sizeOf());
            
    }
}
