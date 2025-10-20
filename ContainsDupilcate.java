import java.util.HashSet;

public class ContainsDupilcate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8};
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(arr[i]))
            {
                System.out.println(true+", Duplicate is: "+arr[i]);
                return;
            }
            else
            {
                s.add(arr[i]);
            }
        }
        System.out.println("Nothing have Duplicate");
    }
}
