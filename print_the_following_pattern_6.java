import java.util.Scanner;
public class numtri {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i=n;i>=1;i--){
            
            for(int j=n;j>=1;j--){
            
                System.out.print(j + " ");
                
            }
            System.out.print("
");
        }
    }
}
