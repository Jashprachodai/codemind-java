import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        if(a!=0 && a%2==0)
        System.out.print("YES");
        else if(a==0 && b%2==0)
        System.out.print("YES");
        else
        System.out.print("NO");
        
    }
}