import java.util.*;
public class Main{
    public static void main(String[] aerfadx){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}