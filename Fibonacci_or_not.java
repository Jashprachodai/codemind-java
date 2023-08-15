import java.util.Scanner;
public class Main{
    public static void main(String[] at){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int a=0,b=1,c=0;
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        if(c==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}