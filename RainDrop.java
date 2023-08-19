import java.util.Scanner;
public class Main{
    public static void main(String[] a){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int t=0;
        if(n%3==0){
        System.out.print("Pling");
        t=1;
        }
        if(n%5==0){
        System.out.print("Plang");
        t=1;
        }
        if(n%7==0){
        System.out.print("Plong");
        t=1;
        }
        if(t==0)
        System.out.print(n);
    }
}