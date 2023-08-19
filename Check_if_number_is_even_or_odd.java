import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        if(t%2==0)
        System.out.print("Even");
        else
        System.out.print("Odd");
    }
}