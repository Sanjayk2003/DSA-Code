class Tri{
    Trinode root;
    Tri()
    {
        root=new Trinode();
    }
    class Trinode{
        Trinode alphabet[]=new Trinode[26];
        boolean isLast;
        
    }
    void insert(String s)
    {
        if(s.isEmpty())
        {
            throw new IllegalArgumentException("Enter something");
        }
     char arr[]=s.toCharArray();
     Trinode c=root;
     for(int i=0;i<arr.length;i++)
     {
         int n=arr[i]-'a';
         if(c.alphabet[n]==null)
         {
          Trinode node=new Trinode();
          c.alphabet[n]=node;
          c=node;
         }
         else{
            c=c.alphabet[n]; 
        }
    }
    c.isLast=true;

    }
}
public class TriDataStruct {
    public static void main(String[] args) {
        Tri t=new Tri();
        t.insert("cat");
        t.insert("ca");
        System.out.println("successfull");
    }
}
