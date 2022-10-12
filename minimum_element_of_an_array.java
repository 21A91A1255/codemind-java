import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,i,k=0,s=0,p,min=1000;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}
