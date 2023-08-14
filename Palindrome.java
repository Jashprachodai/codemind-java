import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob= new Scanner(System.in);
        int n;
        n=ob.nextInt();
        if(pali(n)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
    public static boolean pali(int n){
        int t=n,x=0;
        while(n!=0){
            x=(x*10)+(n%10);
            n=n/10;
        }
        if(x==t)
        return true;
        else
        return false;
    }
}