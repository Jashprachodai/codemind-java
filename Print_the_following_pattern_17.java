import java.util.*;
public class Main{
    public static void main(String[] aerfadx){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i==j || j==n-i+1)
                System.out.print(i + " ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}