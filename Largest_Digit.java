import java.util.Scanner;
public class Main{
    public static void main(String[] aa){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int s=0;
        while(n!=0){
            s=Math.max(s,n%10);
            n=n/10;
        }
        System.out.print(s);
    }
}