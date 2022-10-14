import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,j,p=0,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        //int[] arr = new int[100];
        for(i=a;i<b;i++)
        {
            c=0;
            for(j=1;j<=b;j++)
            {
                if(i%j==0)
                {
                    c+=1;
                }
            }
            //System.out.print(c+" ");
            if(c==2)
            {
                System.out.printf("%d
",i);
            }
        }
    }
       
}