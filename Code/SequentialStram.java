import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class SequentialStram {
    public static final ForkJoinPool f=new ForkJoinPool();
    public static final List<Integer> paralleltimeline=List.of(1,2,3,4,5,6,7,8);
    public static final List<Integer> sequentialtimeline=List.of(1,2,3,4,5,6,7,8);
    public static void main(String[] args) {
        System.out.println("Parallel Stream");
        paralleltimeline.parallelStream().map((item)->item*10).filter(num -> num%20==0).forEach(System.out::println);
        System.out.println("Sequential Stream");
        sequentialtimeline.stream().map((item)->item*10).filter((num)->num%20==0).forEach(System.out::println);
    }
}
