import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int t=Math.abs(n);
        if(n>0){
            int s=0;
            while(n!=0){
                s=s*10+n%10;
                n=n/10;
            }
            System.out.print(s);
        }
        else{
            int s=0;
            while(t!=0){
                s=s*10+t%10;
                t=t/10;
            }
            System.out.printf("-%d",s);
        }
    }
}