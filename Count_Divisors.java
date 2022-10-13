import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,c,i,r,temp,p=0,m=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                m+=1;
            }
        }
        System.out.print(m);
        
    }
}