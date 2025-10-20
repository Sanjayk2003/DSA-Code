
public class AddTownumber 
{
    public static void main(String[] args) {
        int a=15;
        int b=27;
         while(b!=0)
        {
            int c=a&b;
            a=a^b;
            b=c<<1;
        }
        System.out.println(a);
    }
}
