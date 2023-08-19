import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int a,b;
        a=ob.nextInt();
        b=ob.nextInt();
        int arr[][] = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j] = ob.nextInt();
            }
        }
        int s=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0 || j==0 || j==b-1 || i==a-1)
                continue;
                else
                s+=arr[i][j];
            }
        }
        System.out.print(s);
    }
}