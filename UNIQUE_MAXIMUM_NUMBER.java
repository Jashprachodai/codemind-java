import java.util.*;
public class Main{
    public static void main(String[] arrrr){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int f=0,m=0;
        for(int i=0;i<n;i++){
            if(count(arr,arr[i])==1){
            m=Math.max(m,arr[i]);
            f=1;
            }
        }
        if(f==0)
        System.out.print(-1);
        else
        System.out.print(m);
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
    