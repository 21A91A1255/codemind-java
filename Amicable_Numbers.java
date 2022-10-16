import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,sum=0,res=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
         for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
      //  printf("%d",sum);
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            {
                res=res+i;
            }
        }
       // printf("%d  ",res);
        if(b==sum && a==res)
        {
            System.out.printf("Amicable");
        }
        else
        {
            System.out.printf("Not Amicable");
        }
    }
}