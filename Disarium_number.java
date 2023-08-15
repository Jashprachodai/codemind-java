import java.util.Scanner;
public class Main{
    public static void main(String[] aa){
        Scanner ob = new Scanner(System.in);
        String n;
        n=ob.nextLine();
        int d=0,t,l;
        t=Integer.parseInt(n);
        l=n.length();
        for(int i=0;i<l;i++){
            d=d+(int)Math.pow((int)n.charAt(i)-48,(i+1));
        }
        if(d==t)
        System.out.print("True");
        else
        System.out.print("False");
    }
}