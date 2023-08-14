import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ob= new Scanner(System.in);
        int n,l;
        n=ob.nextInt();
        l=ob.nextInt();
        for(int i=1;i<=l;i+=2){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
    
}