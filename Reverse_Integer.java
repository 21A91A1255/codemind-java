import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c,n,d,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0 || n<0)
        {
            d=n%10;
            sum=sum*10+d;
            n=n/10;
        }
        System.out.printf("%d",sum);
    }
}