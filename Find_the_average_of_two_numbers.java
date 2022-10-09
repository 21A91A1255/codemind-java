import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        float c=(a+b);
        float d=c/2;
        System.out.printf("%.4f",d);
    }
}