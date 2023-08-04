import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        float a,b;
        a=ob.nextFloat();
        b=ob.nextFloat();
        float av;
        av=(a+b)/2;
        System.out.printf("%.4f",av);
    }
}