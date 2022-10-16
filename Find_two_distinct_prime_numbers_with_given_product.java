import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int n,i,j,sum=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(i*j==n)
                {
                    c+=1;
                    System.out.printf("%d %d",i,j);
                }
            }
        }
        if(c==0)
        {
        System.out.printf("-1");
        }
    }
}