import java.util.Scanner;
public class Main{
    public static void main(String[] arrg){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        while(true){
            n=sqd(n);
            if(n<10)
            break;
        }
        if(n==1 || n==7)
        System.out.print("True");
        else
        System.out.print("False");
    }
    public static int sqd(int n){
        int s=0;
        while(n!=0){
            s=s+(n%10)*(n%10);
            n=n/10;
        }
        return s;
    }
}