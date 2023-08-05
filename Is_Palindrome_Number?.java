import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int n;
        n = ob.nextInt();
        int x,s=0,t;
        t=n;
        while(n!=0){
            x=n%10;
            s=s*10+x;
            n=n/10;
        }
        if(s==t){
            System.out.print(2);
        }
        else{
            System.out.print(1);
        }
    }
}