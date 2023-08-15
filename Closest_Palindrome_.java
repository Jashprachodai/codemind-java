import java.util.Scanner;
public class Main{
    public static void main(String[] aa){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int fp=n+1,bp=n-1;
        while(true){
            if(pali(fp))
            break;
            fp++;
        }
        while(true){
            if(pali(bp))
            break;
            bp--;
        }
        if((fp-n)==(n-bp))
        System.out.print(bp+" "+fp);
        else if((fp-n)<(n-bp))
        System.out.print(fp);
        else
        System.out.print(bp);
    }
    public static boolean pali(int n){
        int t=n,x=0;
        while(n!=0){
            x=x*10+n%10;
            n=n/10;
        }
        return x==t;
    }
}