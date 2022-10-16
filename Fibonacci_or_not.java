import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,a=0,b=1,next;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==a||n==b)
        {
        System.out.printf("Fibonacci number");
        }
        else
        {
            next = a+b;
            while(next <n)
            {
                a = b;
                b=next;
                next = a+b;
                
            }
            if(next==n)
            {
            System.out.printf("True");
            }
            else
            {
            System.out.printf("False");
            }
        }
    }
}