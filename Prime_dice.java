import java.util.Scanner;
public class Main{
    public static void main(String[] aarg){
        Scanner ob = new Scanner(System.in);
        int t;
        t=ob.nextInt();
        while(t!=0){
            int a,b;
            a=ob.nextInt();
            b=ob.nextInt();
            int c=a+b;
            if(prime(c)==true){
                System.out.println("tevitt");
            }
            else{
                System.out.println("Satya");
            }
            t--;
        }
    }
    static boolean prime(int n){
            if(n==1)
            return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                return false;
            }
            return true;
        }
}