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
       for(i=a;i>=0;i--)
       {
           if(arr[i]==b)
           {
               c+=1;
           }
       }
       System.out.print(c);
    }
}