import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        float a,b;
        Scanner sc=new Scanner(System.in);
         a=sc.nextFloat();
         b=sc.nextFloat();
       // c=sc.nextInt();
         float c=a*b;
        System.out.format("%.2f",c);
    }
}