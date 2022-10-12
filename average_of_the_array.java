import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,i,k=0;
        float s=0,p;
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
        System.out.format("%.2f",p);
    }
}