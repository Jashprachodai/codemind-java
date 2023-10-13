import java.util.*;
public class Main{
    public static void main(String[] arre){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
            if (digits(arr[i])%2==0)
            c++;
        }
        System.out.print(c);
        
    }
    public static int digits(int n){
        String s = String.valueOf(n);
        return s.length();
    }
}