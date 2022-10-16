import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,r,p,s=0,k=0,d,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n*n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        p=s*s;
        while(p>0)
        {
            d=p%10;
            k=(k*10)+d;
            p=p/10;
        }
        if(t==k)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}