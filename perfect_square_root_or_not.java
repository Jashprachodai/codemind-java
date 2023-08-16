import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int d;
        d=(int)Math.sqrt(n);
        if(d*d==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}