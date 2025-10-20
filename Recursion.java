public class Recursion {
    void simply(int n) 
  {
      if(n == 0)
      return;
      simply(n-1);
      System.out.println(n);
//return simply(n-1) * n;

}
public static void rev(int a)
{if(a==0)
    {
        return;
    }
    System.out.print(a%10);
   rev(a/10);
}
public static void Simply(int n){
    if(n==0)
    return;
    Simply(n/2);
    System.out.print(n%2);
}
int max(int arr[],int n)
{
    if(n==1)
    return arr[0];
    int x=max(arr,n-1);
    System.out.println(x);
    if(x<arr[n-1]){
    return arr[n-1];}
    else
    return x;
}
int tree(int n)
{
    if(n==1)
    return 1;
    if(n==0)
    return 0;
    return tree(n-1)+tree(n-2);
}
static void nothing(int n)
{
    if(n>0)
    {
        nothing(n-1);
        System.out.println(n);
        nothing(n-1);
    }
}
static void FLOW(int low,int high)
{
if(low<=high)
{
    low++;
    FLOW1(low,high);
    System.out.print(low);
}
else
return;
}
static void FLOW1(int low,int high)
{
if(low<=high)
{
    low++;
    FLOW(low,high);
    System.out.print(low);
}
else
return;
}




public static void main(String args[])
{
    Recursion s=new Recursion(); 
s.simply(4);
// System.out.println(a);
s.rev(678);
System.out.println( );
s.Simply(10);
int arr[]={2,6,7,90};
System.out.println(s.max(arr,4));
System.out.println(s.tree(5)+"jnhjhjh");
nothing(3);
FLOW(2,5);
}

}
