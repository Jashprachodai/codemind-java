import java.util.*;
public class Main{
    public static void main(String[] arrr){
        Scanner ob = new Scanner(System.in);
        int x=ob.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i]=ob.nextInt();
        }
        int c=0,m=0;
        for(int i=0;i<x;i++){
            if(arr[i]==1)
            c++;
            else{
                m=m>c?m:c;
                c=0;
            }
        }
        m=m>c?m:c;
        System.out.print(m);
    }
}