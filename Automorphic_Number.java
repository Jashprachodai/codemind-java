import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        String n;
        n=ob.nextLine();
        int l=n.length();
        int num;
        num=Integer.parseInt(n);
        int s=num*num;
        s=s%(int)Math.pow(10,l);
        if(num==s)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
    
}