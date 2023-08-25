import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int a,b;
        a=ob.nextInt();
        b=ob.nextInt();
        int m=0,n=0,x;
        for(int i=a;i<=b;i++){
            x=Math.max(m,collatz(i));
            if(m<x){
                m=x;
                n=i;
            }         
        }
        System.out.print(n);
    }
    public static int collatz(int n){
        int c=0;
        while(n!=1){
            n = n%2==0 ? n/2 : 3*n+1 ;
            c++;
        }
        return c;
    }
}