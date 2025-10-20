import java.util.*;
import java.time.*;

class Main{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    LocalDate l=LocalDate.now();
    LocalDateTime lt=LocalDateTime.now();
    System.out.println(l);
    System.out.println(lt.getDayOfWeek());
} 
}

