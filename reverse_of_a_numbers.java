import java.util.Scanner;
public class Main{
    public static void main(String[] arrg){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        System.out.print(rev(n));
    }
    public static int rev(int n){
        int s=0;
        while(n!=0){
            s=s*10+(n%10);
            n=n/10;
        }
        return s;
    }
}