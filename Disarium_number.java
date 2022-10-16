import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,i,sum=0,res=0,r,d,k,temp;;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         temp=n;
        i=1;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        while(sum>0)
        {
            d=sum%10;
            double p=Math.pow(d,i);
            k=(int)p;
            res=res+k;
            sum=sum/10;
            i++;
        }
        if(res==temp)
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
    }
}