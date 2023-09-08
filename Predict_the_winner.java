import java.util.*;
public class Main{
    public static void main(String[] arrrr){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int x=0,y=0;
        int c;
        if(n%2==0)
        c=n/2 - 1;
        else
        c=n/2;
        for(int i=0;i<n;i++){
            if(i<=c)
            x+=arr[i];
            else
            y+=arr[i];
        }
        int ab = Math.abs(x-y);
        System.out.print( ab%4==0 ? "X" : "Y");
    }
    
}