class Single{
    private Single()
    {

    }
    private static Single s;
    static Single call()
    {
     if(s==null)
     {
      s=new Single();
     }
     return s;
    }
   int b;
}
public class SingletonClass {
    public static void main(String[] args) {
        Single s=Single.call();
        Single s1=Single.call();
        s.b=10;
        System.out.println(s.b);
        System.out.println(s1.b);
        
    }
}
