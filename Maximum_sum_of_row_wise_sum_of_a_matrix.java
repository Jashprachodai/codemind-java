import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int a,b;
        a=ob.nextInt();
        b=ob.nextInt();
        int arr[][] = new int[a][b];
        int s=0,m=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=ob.nextInt();
                s+=arr[i][j];
            }
            m=Math.max(m,s);
            s=0;
        }
        System.out.print(m);
    }
}