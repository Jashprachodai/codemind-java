import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        if(n>=4 && n<=6)
        System.out.print("Summer");
        else if(n>=7 && n<=10)
        System.out.print("Rainy");
        else if(n==11 || n==12 || n==1)
        System.out.print("Winter");
        else if(n==2 || n==3)
        System.out.print("Spring");
        else
        System.out.print(-1);
    }
}