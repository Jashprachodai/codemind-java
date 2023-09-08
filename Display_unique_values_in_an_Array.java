import java.util.*;
public class Main{
    public static void main(String[] arrrr){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++){
            if(count(arr,arr[i])==1){
            f=1;
            System.out.print(arr[i] + " ");
            }
        }
        if(f==0)
        System.out.print(-1);
    }
    public static int count(int[] arr,int k){
        int c=0;
        for(int i:arr){
            if(i==k)
            c++;
        }
        return c;
    }
}