

import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,large=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                
                if(i>large)
                {
                    large=i;
                }
            }
        }
        System.out.print(large);
    }
}