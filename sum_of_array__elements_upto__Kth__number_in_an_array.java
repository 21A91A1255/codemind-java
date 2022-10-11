import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,s=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       b=sc.nextInt();
       for(i=0;i<b;i++)
       {
           s=s+arr[i];
       }
       System.out.print(s);
    }
}