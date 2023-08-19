import java.util.Scanner;
public class Main{
    public static void main(String[] ra){
        Scanner ob = new Scanner(System.in);
        int a,b,c;
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        if(a>50 && b>60 && c>100){
            System.out.print("10");
        }
        else if(a>50 && b>60){
            System.out.print("9");
        }
        else if(b>60 && c>100){
            System.out.print("8");
        }
        else if(a>50 && c>100)
        System.out.print("7");
        else if(a>50 || b>60 || c>100)
        System.out.print("6");
        else
        System.out.print("5");
    }
}