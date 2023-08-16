import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int rn=rev(n);
        if(n*n==rev(rn*rn))
        System.out.print("True");
        else
        System.out.print("False");
    }
    public static int rev(int n){
        int x=0;
        while(n!=0){
            x=x*10+n%10;
            n=n/10;
        }
        return x;
    }
}