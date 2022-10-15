import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c,n,r,sum=0,s,k=0,p,d,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=n;
        while(n>0)
        {
            d=n%10;
            s=1;
            for(i=1;i<=d;i++)
            {
                s=s*i;
                
                
            }
            //System.out.print(s+" ");
            k=k+s;
            n=n/10;
        }
        //System.out.print(k);
        if(k==p)
        {
            System.out.print("The number "+p+" is a strong number");
        }
        else
        {
             System.out.print("The number "+p+" is not a strong number");
        }
    }
}