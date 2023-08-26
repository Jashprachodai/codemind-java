import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        for(int x = 1 ; x<=t; x++){
            int a,b;
        a=ob.nextInt();
        b=ob.nextInt();
        int c=0,k;
        for(int i=a;i<=b;i++){
            k=i%10;
            if(k==2 || k==3 || k==9)
            c++;
        }
        System.out.println(c);
        }
    }
}