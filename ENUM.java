import java.util.*;
enum Color{
    RED(1),BLUE(1);
    private int value;

    Color(int value)
    {
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
enum Days{
    SUNDAY("sunday"),MONADAY("monday"),TUESDAY("tuesday"),THURSDAY("thursday"),FRIDAY("friday"),SATURDAY("saturday");
    String today;
    Days(String today){
        this.today=today;
    } 
}
public class ENUM {
    public static void main(String[] args) {
      Color c1=Color.RED;
      //Days d=Days.MONADAY;
      for(Days d: Days.values()){
         System.out.println(d);
      }
    //   System.out.println(d.today);
      System.out.println(c1.getValue()+2 );
    }}