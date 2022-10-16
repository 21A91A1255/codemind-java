import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>n)
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
    }
}