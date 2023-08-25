import java.util.Scanner;
public class numtri {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(j==i)
                System.out.print("0");
                else
                System.out.print("x");
                
            }
            System.out.print("
");
        }
    }
}
