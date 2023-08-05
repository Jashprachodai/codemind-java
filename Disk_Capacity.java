import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        System.out.print(a*b*c*1024);
    }
}