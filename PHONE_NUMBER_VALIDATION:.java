import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        String n;
        n=ob.nextLine();
        int l=n.length();
        if(l!=10)
        System.out.print("Invalid");
        else{
            if(n.charAt(0)=='0')
            System.out.print("Invalid");
            else
            System.out.print("Valid");
        }
    }
}