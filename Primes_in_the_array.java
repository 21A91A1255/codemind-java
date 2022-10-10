import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,i,j,p=0,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       //b=sc.nextInt();
       for(i=0;i<a;i++)
        { 
        c=0;
        if(arr[i]==1)
            continue;
        for(j=2;j<arr[i];j++)
        {
            if(arr[i]%j==0)
            {
                c++;
            }
        }
        if(c==0)
        {
                p++;
    
        }
    }
      System.out.print(p);
    }
}