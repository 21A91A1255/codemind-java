import java.util.*;
class Main{
    public static int prime(int n){
        if(n<2){
            return 0;
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []l=new int[n];
        for(int i=0;i<l.length;i++){
            l[i]=s.nextInt();
        }
        float c=0,d=0;
        for(int i=0;i<l.length;i++){
            if(prime(l[i])==1){
                c+=l[i];
                d++;
            }
            
        }
        // float k=float(c)/(d);
        System.out.printf("%.2f",c/d);
    }
}