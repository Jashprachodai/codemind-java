import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t!=0){
            double a,b,c,d;
            a=ob.nextDouble();
            b=ob.nextDouble();
            c=ob.nextDouble();
            d=ob.nextDouble();
            if(c/a < d/b)
            System.out.println(-1);
            else if(c/a == d/b)
            System.out.println(0);
            else
            System.out.println(1);
            t--;
        }
    }
}