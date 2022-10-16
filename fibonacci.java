import java.util.Scanner;
import java.lang.Math;
class First{
    public static int fact(int n){
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return(fact(n-1)+fact(n-2));
    }
    public static void main(String args[])
    {
        int a,b,c,n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        int res=fact(i);
        System.out.printf("%d ",res);
        }
    }
}
        