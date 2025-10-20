import java.util.Scanner;
import java.util.function.*;

public class square {
    public static void main(String[] args) {
    
    Function<Integer,Integer> ne=a -> a/10;
    Function<Integer,Integer> f= a -> a%2==0?a:0;
    System.out.println(f.andThen(ne).apply(10));

    }
}
