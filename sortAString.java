import java.util.Arrays;

public class sortAString {
    public static void main(String[] args) {
        String t="Zello";
        char c[]=t.toCharArray();
        Arrays.sort(c);
        String s=new String(c);
        System.out.println(s);
    }
}
