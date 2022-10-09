import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        //b=sc.nextInt();
       if(a>=0)
       {
           System.out.print("Positive Number");
       }
       else
       {
             System.out.print("Negative Number");
       }
    }
}