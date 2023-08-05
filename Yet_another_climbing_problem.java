import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int t;
        t = ob.nextInt();
        for(int i=1;i<=t;i++){
            int a,b,c;
            a = ob.nextInt();
            b = ob.nextInt();
            c=(a/b)+(a%b);
            System.out.println(c);
        }
    }
}