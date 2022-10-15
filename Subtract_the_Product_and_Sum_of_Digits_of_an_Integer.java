import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c,n,r,s=0,p=1,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        t=p-s;
        System.out.print(t);
}
}