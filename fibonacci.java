import java.util.Scanner;
public class Main{
    public static void main(String[] aa){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int a=0,b=1,c=0;
        while(n!=0){
            System.out.print(c + " ");
            a=b;
            b=c;
            c=a+b;
            n--;
        }
        
    }
}