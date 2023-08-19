import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        while(true){
            n+=1;
            if(pali(n) && prime(n))
            break;
        }
        System.out.print(n);
    }
    public static boolean prime(int n){
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static boolean pali(int n){
        int s=0,x,t=n;
        while(n!=0){
            x=n%10;
            s=s*10+x;
            n=n/10;
        }
        return t==s;
    }
}