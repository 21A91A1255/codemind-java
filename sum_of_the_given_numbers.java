import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,a,b,p,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            p=a+b;
            System.out.printf("%d
",p);
        }
    }
}
        