import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,j,c=0,k=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       b=sc.nextInt();
       for(i=0;i<a;i++)
       {
           if(arr[i]==b)
           {
               k++;
               //System.out.print("True");
           }
           
       }
       if(k==0)
       {
               System.out.print("False");
       }
       else
       {
           System.out.print("True");
       }
    }
}