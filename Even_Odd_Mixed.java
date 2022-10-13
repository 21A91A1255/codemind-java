import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,c=0,i,r,temp,p=0,m=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        //b=sc.nextInt();
        while(a>0)
        {
            r=a%10;
            m+=1;
            if(r%2==0)
            {
                c+=1;
            }
            else
            {
                p+=1;
            }
            a=a/10;
        }
        if(c==m)
        {
            System.out.print("Even");
        }
        else if(p==m)
        {
             System.out.print("Odd");
        }
        else
        {
             System.out.print("Mixed");
        }
    }
}