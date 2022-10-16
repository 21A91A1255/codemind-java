import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,d;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a= new int[100];
        while(n>0)
        {
            d=n%10;
            if(a[d]==1)
            {
                break;
            }
            else
            {
                a[d]=1;
            }
            n=n/10;
        }
        if(n>0)
        {
            System.out.printf("Not Unique Number");
        }
        else
        {
            System.out.printf("Unique Number");
        }
    }
}