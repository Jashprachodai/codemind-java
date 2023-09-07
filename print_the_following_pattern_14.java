import java.util.*;
public class alltest {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if(k==1||k==n||i==n||i==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
        
}


