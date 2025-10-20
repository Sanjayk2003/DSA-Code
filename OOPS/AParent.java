abstract public class AParent {
    private int a;
    private String pass;
    
    static int count=0;
    AParent(int a,String pass)
    {
        this.pass=pass;
        this.a=a;
        count++;
    }
    AParent()
    {
     count++;
    }
    abstract void name(String name);

    static void totalChild()
    {

         System.out.println(count);
    }

    
}
