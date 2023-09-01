import java.util.Scanner;
public class Main{
    public static void main(String[] argg){
        Scanner ob = new Scanner(System.in);
        String time = ob.nextLine();
        String[] t = time.split(":");
        double a,b;
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        a = Math.abs((5.5*m)-(30*h));
        b = 360-a;
        a = Math.min(a,b);
        System.out.printf("%.1f",a);
    }
}