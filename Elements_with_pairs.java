import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,j,p=0,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<a;i++)
       {
           if(a%2==0)
           {
               System.out.print(arr[i]+" ");
           }
           else
           {
               System.out.print(arr[i]+" ");
    
           }
       }
       if(a%2!=0)
       {
           System.out.print("0");
       }
    }
}