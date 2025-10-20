package ZohoConfusion;

import java.util.HashMap;
import java.util.*;

public class Process {
  static HashMap<Integer,LinkedList<String>> map=new HashMap<>();
  static LinkedList<Integer> l1=new LinkedList<>();
  void printt(){
    Process p=new Process();
   for(int i=0;i<10;i++)
   {
    LinkedList<String> l=new LinkedList<>();
    l.add("Hello"+i);
    l.add("Hello"+i);
    map.put(i,l);
   }
 
   for(int k:l1)
   {

   }
   for(LinkedList k:map.values()){
    
        for(Object s:k){
         System.out.print(s);
        }
        System.out.println();
   }
}

}
