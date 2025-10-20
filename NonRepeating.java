import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        char s[]="abb".toCharArray();
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
        m.put(s[i],m.getOrDefault(s[i], 0)+1);
        }
        for(int i=0;i<s.length;i++){
          if(m.get(s[i])==1){
          System.out.println(s[i]);
          return;
          }
        }
        
    }
}
