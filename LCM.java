import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,t=2,lcm=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        while(a>0)
        {
            if(a%t==0 && b%t==0)
            {
                a=a/t;
                b=b/t;
                lcm=lcm*t;
            }
            else
            {
                t++;
            }
            if(a<t || b<t)
            {
                break;
            }
          
        }
        System.out.printf("%d",lcm*a*b);
    }
}
