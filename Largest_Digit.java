import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int n,r,i,a,large=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         while(n>0)
        {
            r=n%10;
            if(r>large)
            {
                large=r;
            }
            n=n/10;
        }
        System.out.printf("%d",large);
    }
}