import java.util.Scanner;
public class Mian{
    public static void main(String[] arfg){
        Scanner ob = new Scanner(System.in);
        char a;
        a=ob.next().charAt(0);
        if(a>='A' && a<='Z')
        System.out.print("uppercase alphabet");
        else if(a>='a' && a<='z')
        System.out.print("lowercase alphabet");
        else
        System.out.print("not an alphabet");
    }
}