import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c,n,i,o,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            double t=Math.sqrt(a);
            o=(int)t;
            r=o*o;
            if(r==a)
            {
                System.out.print("True
");
            }
            else
            {
                System.out.print("False
");
            }
        }
    }
}