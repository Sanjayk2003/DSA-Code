import java.util.*;
class BracketCheck{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int n=s.length;
        Stack<Character> s1=new Stack<>();
        int f=1;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='{'||s[i]=='('||s[i]=='[')
            {
                s1.push(s[i]);
            
            }
            else{
                if(s1.isEmpty())
                {
                    System.out.println("False");
                    f=0;
                    break;
                }
                else{
                char top=s1.peek();
                if((top=='{'&&s[i]=='}')||(top=='('&&s[i]==')')||top=='['&&s[i]==']')
                {
                s1.pop();
                
                }
            }
            }
            
            
        }
        if(s1.empty()&&f==1)
        {
            System.out.println("True");
        }
        else if(f==1){
           System.out.println("False");
        }
    }
}