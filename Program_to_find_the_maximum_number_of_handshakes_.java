import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n;
        n = ob.nextInt();
        System.out.print(n*(n-1)/2);
    }
}