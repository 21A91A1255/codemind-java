import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,r,i,a,s=0,temp;
        Scanner sc=new Scanner(System.in);
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
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}