import java.util.*;
public class Main{
    public static void main(String[] arre){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();    
        }
        int c;
        for(int i=0;i<n;i++){
            c=0;
            for(int j=0;j<n;j++){
                if(arr[j]<arr[i])
                c++;
            }
            System.out.print(c + " ");
        }
    }
}