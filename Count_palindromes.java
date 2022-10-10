import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,c=0,r;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        //b=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<a;i++)
       {
           int s=0,temp;
           temp=arr[i];
           while(arr[i]>0)
           {
               r=arr[i]%10;
               s=(s*10)+r;
               arr[i]=arr[i]/10;
           }
           if(temp==s)
           {
               c+=1;
           }
       }
       System.out.print(c);
    }
}