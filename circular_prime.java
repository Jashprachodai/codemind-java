import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        if(prime(n)){
            if(prime(rev(n)))
            System.out.print("circular prime");
            else
            System.out.print("prime but not a circular prime");
        }
        else
        System.out.print("not prime");
    }
    public static int rev(int n){
        int s=0;
        while(n!=0){
            s=s*10+n%10;
            n=n/10;
        }
        return s;
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
}