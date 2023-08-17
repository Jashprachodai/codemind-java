import java.util.Scanner;
public class Mian{
    public static void main(String[] arfg){
        Scanner ob = new Scanner(System.in);
        int a,b,c,d;
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        d=ob.nextInt();
        if(a>=10 && b>=10 && c>=10 && d>=10)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}