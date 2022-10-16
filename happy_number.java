import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,d,sum=0,res=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(res!=1 && res!=4)
        {
            res=0;
              while(n>0)
                {
                    d=n%10;
                    res=res+(d*d);
                    n=n/10;
                }
           n=res;
        }
        if(res==1)
        {
           System.out.printf("True");
        }
        else
       {
       	  System.out.printf("False");
	   }
    }
}
                