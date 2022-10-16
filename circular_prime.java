import java.util.Scanner;
import java.lang.Math;
class First{
    static boolean prime(int n){
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,d,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            d=n%10;
            sum=sum*10+d;
            n=n/10;
        }
        if(prime(temp) && prime(sum))
        {
            System.out.printf("circular prime");
        }
        else if(prime(temp))
        {
            System.out.print("prime but not a circular prime");
        }
        else
        {
            System.out.print("not prime");
        }
        //  System.out.print(n);
        //  System.out.print(sum);
    }
}