import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int k;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                // k=2*i;
                System.out.print(n+" x "+i+" = "+n*i+"
");
            }
        }
    }
}