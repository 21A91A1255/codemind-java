import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,i,k=0,s=0,p;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        p=s/n;
        for(i=0;i<n;i++)
        {
            if(arr[i]==p)
            {
                k++;
            }
        }
        if(k==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}