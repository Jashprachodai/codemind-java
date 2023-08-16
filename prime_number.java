import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n,t=1;
        n=ob.nextInt();
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
            System.out.print("not a prime");
            t=0;
            break;
            }
        }
        if(t==1)
        System.out.print("prime");
    }
}