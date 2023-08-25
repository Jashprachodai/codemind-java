import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t!=0){
            String n = ob.next();
            int d = Integer.parseInt(n,2);
            System.out.println(Integer.toString(d,8));
            t--;
        }
    }
}