public class prime {
    public static void main(String[] args) {
        int n1,n2,i,j,flag;
        n1=12;
        n2=30;
       for(i=n1+1;i<=n2-1;i++)
       {
    flag=1; 
        for(j=2;j<i/2;j++)
        {
            if(i%j==0)
            flag=0;
        }
        if(flag==1)
        System.out.println(i+" ");

       }
    }
}
