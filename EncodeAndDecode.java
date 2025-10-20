//In will have two methods 1)Encoding and Decoding
//for that Encoding they provide a list of strings for that string we have 
    //have to return a string which is en coded then we have have to write a method to 
    //decode that string into list of string . 
import java.util.Arrays;
import java.util.*;
public class EncodeAndDecode {
    public static String enCodeString(ArrayList<String> l)
    {
        if(l.size()==0)
        return Character.toString((char)258);
        String seperator=Character.toString((char)257);
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<l.size();i++)
        {
            s.append(l.get(i));
            if(i<l.size()-1)
            {
                s.append(seperator);
            }
        }
        return s.toString();
    }

    static ArrayList<String> decodeString(String s)
    {
        if(s.equals(Character.toString((char)258)))
        {
            return new ArrayList();
        }
        return new ArrayList<>(Arrays.asList(s.split(Character.toString((char)257),-1)));
    }

    public static void main(String[] args) {
      ArrayList<String> s= new ArrayList<>(Arrays.asList("hello","Hi","Welcome"));
      String encoded=enCodeString(s);  
      System.out.println(encoded);
      System.out.println(decodeString(encoded));
      System.out.println(s);
      
    }
}
