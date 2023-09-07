import java.util.*;
public class Main{
    public static void main(String[] aerfadx){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        while(true){
            n+=1;
            if(pali(n) && prime(n))
            break;
        }
        System.out.print(n);
    }
    public static boolean pali(int n){
        int t=n,x=0;
        while(n!=0){
            x=x*10 + (n%10);
            n=n/10;
        }
        return t==x;
    }
    public static boolean prime(int n){
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        if(n%i==0)
        return false;
        return true;
    }
}