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
           if(arr[i]<arr[i+1])
           {
               c+=1;
           }
       }
       //System.out.print(c);
       if(c==(a-1))
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("no");
       }
    }
}