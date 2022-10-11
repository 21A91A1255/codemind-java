import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,i,c=0,s=0,p;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<a;i++)
       {
           s=s+arr[i];
       }
       p=s/a;
       for(i=0;i<a;i++)
       {
           if(arr[i]>=p)
           {
               c++;
           }
       }
       System.out.print(c);
    }
}