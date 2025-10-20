import JDBC.FirstJDBC;


enum Fruit{
    APPLE("apple"),ORANGE("orange");
    String va;
    Fruit(String va)
    {
     this.va=va;
    }
    String get()
    {
        return va;
    }

}
public class Zest {

    public static void main(String[] args) {
        Fruit f=Fruit.APPLE;
        System.out.println(f);
        for(Fruit v:Fruit.values())
        {
         System.out.println(v+" "+v.get());
        }
    }
}
