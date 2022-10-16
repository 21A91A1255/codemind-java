import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c=0,n,r,sum=0,s=0,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s=i*(i+1);
            //System.out.print(s+" ");
            if(n==s)
            {
                System.out.print("YES");
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.print("NO");
        }
           
    }
}