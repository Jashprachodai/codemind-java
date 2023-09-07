import java.util.*;
public class Main{
    public static void main(String[] aerfadx){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int a=0,b=1,c=0;
        while(n!=0){
            System.out.printf("%d ",c);
            a=b;
            b=c;
            c=a+b;
            n--;
        }
    }
}