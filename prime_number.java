import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
          for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
       if(c==2)
        {
            System.out.printf("prime");
        }
        else
        {
            System.out.printf("not a prime");
        }
    }
}