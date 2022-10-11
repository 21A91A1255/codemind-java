import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,i,c=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<a;i++)
       {
           if(arr[i]%2!=0)
           {
               System.out.print(arr[i]+" ");
           }
       }
       for(i=0;i<a;i++)
       {
           if(arr[i]%2==0)
           {
               System.out.print(arr[i]+" ");
           }
       }
    }
}