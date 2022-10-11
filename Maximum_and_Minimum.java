import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,i,j;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int[] arr = new int[100];
       for(i=0;i<a;i++)
       {
           arr[i]=sc.nextInt();
       }
       int[] brr = new int[100];
          int c=0,k=0,max=0,min=1000;
    for(i=0;i<a;i++)
    {
        int sum=0;
        for(j=0;j<a;j++)
        {
            if(arr[i]==arr[j])
            {
                sum+=1;
            }
        }
        if(sum==arr[i])
        {
           // printf("%d ",arr[i]);
            brr[k]=arr[i];
            arr[i]=0;
            k++;
            //printf("%d",c);
        }
    }
    if(k==0)
    {
        //printf("-1");
        System.out.print("-1");
    }
    else
    {
        for(i=0;i<k;i++)
        {
            if(max<brr[i])
            {
                max=brr[i];
            }
        }
        for(i=0;i<k;i++)
        {
            if(min>brr[i])
            {
                min=brr[i];
            }
        }
        System.out.print(min+" ");
        System.out.print(max);
    }
}
}