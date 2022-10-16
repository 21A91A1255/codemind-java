import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,r,i,a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int s=0,temp;
            //a=sc.nextInt();
            temp=a;
            while(a>0)
            {
                r=a%10;
                s=(s*10)+r;
                a=a/10;
            }
            System.out.print(s);
    }
}