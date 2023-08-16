import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner ob = new Scanner(System.in);
        String n;
        int t=0;
        n=ob.nextLine();
        int l=n.length();
        for(int i=0;i<l-1;i++){
            char c=n.charAt(i);
            for(int j=i+1;j<l;j++){
                if(c==n.charAt(j)){
                    System.out.print("Not Unique Number");
                    t=1;
                    break;
                }
            }
            if(t==1)
            break;
        }
        if(t==0)
        System.out.print("Unique Number");
    }
    
}