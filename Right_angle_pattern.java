import java.util.Scanner;
public class numtri {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int st = ob.nextInt();
        int p = n*(n+1)/2;
        p=p+(st-1);
        for(int i=n;i>=1;i--){
            for(int s=n-i;s>=1;s--){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                if(i==n||j==i||j==1)
                System.out.printf("%d ",p);
                else
                System.out.print("  ");
                p--;
            }
            System.out.print("
");
        }
    }
}
