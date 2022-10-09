import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int p=(512*a*b*c)*2;
        System.out.print(p);
    }
}