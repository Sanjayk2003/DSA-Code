public class SubSequence {
    static boolean sub(char c1[],char c2[])
    {
     int i=0,j=0;
     while(i<c1.length&&j<c2.length)
     {
      if(c1[i]==c2[j])
      {
        i++;
        j++;
      }
      else{
        i++;
      }
     }   
     if(j==c2.length)
     return true;
     else
     return false;
    }
    public static void main(String[] args) {
        char c1[]="abcde".toCharArray();
        char c2[]="aec".toCharArray();
        System.out.println(sub(c1, c2));

    }
}
