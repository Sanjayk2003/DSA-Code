class Parent{
    int n1;

    Parent(int n1) {
        this.n1 = n1;
    }

}
class Child1 extends Parent{
    int n2;
    Child1(int n1,int n2)
    {
        super(n1);
        this.n2=n2;
    }

}
class Child2 extends Parent{
    int n2;
    public Child2(int n1,int n2){
        super(n1);
        this.n2=n2;
    }

}
public class Hierarchial {
    public static void main(String[] args) {
        Child1 c1=new Child1(1, 2);
        Child2 c2=new Child2(10,20 );
        System.out.println(c1.n1);
        System.out.println(c2.n1);
    }
}
