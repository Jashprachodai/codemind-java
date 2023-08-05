import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        double s,t;
        s=(a+b+c);
        s=s/2.0;
        t=s*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(t));
    }
}