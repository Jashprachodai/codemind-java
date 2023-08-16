import java.util.Scanner;
public class Main{
    public static void main(String[] gr){
        Scanner ob=new Scanner(System.in);
        int t,a,b;
        t=ob.nextInt();
        for(int i=1;i<=t;i++){
            a=ob.nextInt();
            b=ob.nextInt();
            System.out.println(a+b);
        }
    }
}