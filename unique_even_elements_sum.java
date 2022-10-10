import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,d,i,j,c,s=0;
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
                arr[i]=-1;
            }
        }
        if(arr[i]%2==0 && c==1)
        {
           s=s+arr[i];
        }
        }
    System.out.print(s);
}
}
