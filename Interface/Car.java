package Interface;

public class Car implements Engine,Wheels{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("I am a");
        
    }
    @Override
    public void run(int n)
    {
     System.out.println();
    }
}
