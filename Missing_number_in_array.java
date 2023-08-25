import java.util.*;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t!=0){
            int n = ob.nextInt();
            int arr[] = new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i]=ob.nextInt();
            }
            Arrays.sort(arr);
            int f=0;
            for(int i=0;i<n-2;i++){
                
                if(arr[i+1]-arr[i]>=2){
                System.out.println(arr[i]+1);
                f=1;
                break;
                }
                else
                continue;
            }
            if(f==0)
            System.out.print(arr[n-2]+1);
            t--;
        }
    }
}