import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,r,i,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int s=0,temp;
            a=sc.nextInt();
            temp=a;
            while(a>0)
            {
                r=a%10;
                s=(s*10)+r;
                a=a/10;
            }
            if(s==temp)
            {
                System.out.print("True
");
            }
            else
            {
                System.out.print("False
");
            }
        }
    }
}