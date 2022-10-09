import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        double a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
       // b=sc.nextInt();
        double n=3.14*a*a;
        System.out.format("%.2f",n);
    }
}