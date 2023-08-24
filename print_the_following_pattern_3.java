import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||j==1||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.print("
");
        }
    }
}
