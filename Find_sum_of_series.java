import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        double s=0;
        for(int i=1;i<=n;i++){
            s+=(1/(double)i);
        }
        System.out.printf("%.2f",s);
    }
}