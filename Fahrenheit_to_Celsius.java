import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        double a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        //b=sc.nextInt();
        //double f=32+(a*9/5);
        double f = (a-32)*0.5555555555555556;
        System.out.format("%.2f",f);
    }
}