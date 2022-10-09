import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s=(a+b+c)/2.0;
        double q=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",q);
    }
}