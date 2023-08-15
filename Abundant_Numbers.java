import java.util.Scanner;
public class Main{
    public static void main(String[] aa){
        Scanner ob = new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            s+=i;
        }
        if(s>n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}