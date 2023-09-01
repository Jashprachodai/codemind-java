import java.util.Scanner;
public class Main{
    public static void main(String[] argg){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t!=0){
            int a,b,c;
            a=ob.nextInt();
            b=ob.nextInt();
            c=ob.nextInt();
            int m = Math.max(a,b);
            m = Math.max(m,c);
            int s = a+b+c;
            if(s-m<m)
            System.out.println("YES");
            else
            System.out.println("NO");
            t--;
        }
    }
}