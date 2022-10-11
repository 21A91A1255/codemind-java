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
       for(i=1;i<a-1;i++)
       {
           if(arr[i-1]%2==0 && arr[i+1]%2==0)
           {
               if(arr[i]%2==0)
               {
                   c+=1;
               }
           }
       }
       System.out.print(c);
    }
}