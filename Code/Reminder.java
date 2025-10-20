public class Reminder implements Abstract{
    public static void main(String[] args) {
        Reminder r= new Reminder();
        System.out.println(r.sum(1, 2));
        r.display();
    }
    public int sum(int a,int b){
        return a+b;
    }
}
interface Abstract{
    public int sum(int a,int b);
    default void display(){
     System.out.println("Interface is running");
    }
}
