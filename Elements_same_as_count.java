import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,i,j,c,k=0;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(i=0;i<a;i++)
       {
           c=1;
           if(arr[i]==-1)
           {
               continue;
           }
           for(j=i+1;j<a;j++)
           {
               if(arr[i]==arr[j])
               {
                   c++;
                   arr[j]=-1;
               }
           }
           if(c==arr[i])
           {
               k++;
               System.out.print(arr[i]+" ");
           }
       }
       if(k==0)
       {
           System.out.print("-1");
       }
    }
}