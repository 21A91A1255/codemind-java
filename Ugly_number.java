

import java.util.Scanner;
import java.lang.Math;
class First{
    public static void main(String args[])
    {
        int a,b,c,n,r,sum=0,x=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n != 1) 
       {  
           if (n % 5 == 0) 
            {  
                n /= 5;  
            } 
            else if (n % 3 == 0) 
            {  
                n /= 3;  
            } 
            else if (n % 2 == 0) 
            {  
                n /= 2;  
            } 
            else 
            {  
               System.out.printf("Not Ugly Number"); 
                x = 1;  
                break;  
            }  
        } 
        if (x==0)
       { 
           System.out.printf("Ugly Number");
       }
    }
}
