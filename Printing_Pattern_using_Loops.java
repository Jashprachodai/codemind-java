import java.util.Scanner;
public class innerreduce {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i<=n){
                    if(i==1 || i==2*n-1 || j==1 || j==2*n-1)
                    System.out.print(n + " ");
                    else if(j>=i && j<=2*n-i)
                    System.out.print(n-i+1 + " ");
                    else if(j<=n)
                    System.out.print(n-j+1 + " ");
                    else
                    System.out.print(j-n+1 + " ");
                }
                else{
                    if(i==1 || i==2*n-1 || j==1 || j==2*n-1)
                    System.out.print(n+ " ");
                    else if(j<=i && j>=2*n-i)
                    System.out.print(i-n+1 + " ");
                    else if(j<=n)
                    System.out.print(n-j+1 + " ");
                    else
                    System.out.print(j-n+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
