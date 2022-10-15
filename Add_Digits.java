import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c,n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<10)
        {
        System.out.print(n);
        }
        else
        {
        while(n>9) 
        {
        sum=0;
        while(n>0) 
        {
        r=n%10;
        n=n/10;
        sum=sum+r;
        }
        n=sum;
        }
}
System.out.print(sum);
}

}
    