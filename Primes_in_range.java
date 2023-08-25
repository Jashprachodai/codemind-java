import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int a,b;
        a=ob.nextInt();
        b=ob.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            if(prime(i)){
                c++;
            }
        }
        System.out.print(c);
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