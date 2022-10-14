import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int base,exponent,c,r;
    Scanner sc= new Scanner(System.in);
    base=sc.nextInt();
    exponent=sc.nextInt();
    c=sc.nextInt();
    double result = Math.pow(base, exponent);
    double p=result%c;
    r=(int)p;
    System.out.print(r);
  }
}