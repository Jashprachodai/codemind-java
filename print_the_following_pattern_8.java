import java.util.*;
public class Main{
    public static void main(String[] aerfadx){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-2;j++){
                System.out.printf("%d",j);
            }
            for(int k=n-3;k>=1;k--){
                System.out.printf("%d",k);
            }
            System.out.println();
        }
    }
}