import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,sum,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double p=Math.sqrt(n);
        res=(int)p;
        sum=n-(res*res);
        if(sum==0)
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
    }
}