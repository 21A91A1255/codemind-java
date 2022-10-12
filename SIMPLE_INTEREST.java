import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int s,a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a*b*c)/100;
        //double q=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print(s);
    }
}