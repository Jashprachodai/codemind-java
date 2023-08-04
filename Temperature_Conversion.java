import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        float t;
        t=ob.nextFloat();
        float f;
        f=32+(t*9/5);
        System.out.printf("%.2f",f);
    }
}