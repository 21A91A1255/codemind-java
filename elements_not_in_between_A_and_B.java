

import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,d,i,j,c,k=0,s=0,v=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       b=sc.nextInt();
       d=sc.nextInt();
       for(i=0;i<a;i++)
       {
           if(arr[i]>=b && arr[i]<=d)
           {
               v++;
           }
           else
           {
               k++;
               System.out.print(arr[i]+" ");
               //s=s+arr[i];
           }
       }
      // System.out.print(s);
      if(k==0)
      {
          System.out.print("-1");
      }
    }
}