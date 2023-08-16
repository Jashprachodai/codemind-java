import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int a,b;
        a=ob.nextInt();
        b=ob.nextInt();
        if(facsum(a)==b && facsum(b)==a)
        System.out.print("Amicable");
        else
        System.out.print("Not Amicable");
    }
    public static int facsum(int n){
        int s=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            s+=i;
        }
        return s;
    }
}