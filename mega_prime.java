import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,c=0,d,s=0,i,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            int j=0;
            while(n>0)
            {
                s=0;
                d=n%10;
                j++;
                for(i=1;i<=d;i++)
                {
                    if(d%i==0)
                    {
                        s++;
                    }
                }
                if(s==2)
                {
                    k++;
                }
                n=n/10;
            }
            if(k==j)
            {
                System.out.printf("Mega Prime");
            
            }
            else
            {
                System.out.printf("Not Mega Prime");
            }
        
        }
        else
        {
            System.out.printf("Not Mega Prime");
        }
    }
}
        