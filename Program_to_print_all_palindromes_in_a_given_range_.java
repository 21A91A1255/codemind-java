import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,c=0,i,r,temp;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            temp=i;
            int s=0;
            while(temp>0)
            {
                r=temp%10;
                s=(s*10)+r;
                temp=temp/10;
            }
            if(i==s)
            {
                System.out.print(s+" ");
            }
        }
        //System.out.print(c);
    }
}