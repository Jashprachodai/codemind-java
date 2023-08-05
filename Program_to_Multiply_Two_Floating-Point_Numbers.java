import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        float a,b;
        a = ob.nextFloat();
        b = ob.nextFloat();
        System.out.printf("%.2f",a*b);
    }
}