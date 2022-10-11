import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,i,j,c=0,k=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<a;i++)
       {
           if(arr[i]%2==0)
           {
               c+=1;
           }
       }
       if(c==a)
       {
           System.out.print("True");
       }
       else
       {
           System.out.print("False");
       }
    }
}