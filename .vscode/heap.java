class MAX {
    int[] heap;
    int n=0;
    MAX(int n)
    {
    heap=new int[n+1];
    n=0;
    }
boolean isEmpty()
{
    if(n!=0)
    return true;
    else return false;
}
int length()
{
    return n;
}
void insert(int d)   
{
    if(n==heap.length-1)
    {
        resize(2*heap.length);
    }
    n++;
    heap[n]=d;
    swim(n);  
}

void resize(int n)
{
int temp[]=new int[n];
for(int i=0;i<heap.length;i++)
{
temp[i]=heap[i];
}
heap=temp;
}
void swim(int n)    //this is used to check & swap the heap is max by bottom up approach.
{
    while(n>1&&heap[n/2]<heap[n]){
        int temp=heap[n/2];
        heap[n/2]=heap[n];
        heap[n]=temp;
        n=n/2;
    }
}
void display(){
    for(int i=1;i<length();i++)
    {
        System.out.print(heap[i]+" ");
    }
}
int delMax(){
    int max=heap[1];
    swap(1,n);
    n--;                                              //89  14  19  3  9  6 
    check(n);
    heap[n+1]=0;
    if(n==(heap.length-1)/4)
    {
        resize(heap.length/2);
    }
    return max;

}
void check(int k)
{
    while(k*2<=n) //5
    {
        int j=k*2;
     if(k*2<n&&heap[j]<heap[j+1])
     {
        j++;
     }
     if(heap[k]>=heap[j])
     break;
     swap(k,j);
     k=j;

    }
}
void swap(int a,int b)
{
    int temp=heap[a];
    heap[a]=heap[b];
    heap[b]=temp;
}

}


public class heap {
     
    public static void main(String[] args) {
        MAX m=new MAX(3);
        System.out.println(m.isEmpty());
        System.out.println(m.length());
        m.insert(10);
        m.insert(3);
        m.insert(14);
        m.insert(9);
        m.insert(19);
        m.insert(89);
        m.display();
        System.out.println(m.length());
        System.out.println(m.length());
        System.out.println(m.delMax());
        m.display();
    }
}
