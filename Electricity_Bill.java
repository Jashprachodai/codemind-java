import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        String id = ob.nextLine();
        String name = ob.nextLine();
        int u = ob.nextInt();
        double bill;
        if(u<200)
        bill=u*1.2;
        else if(u>=200 && u<400)
        bill=u*1.5;
        else if(u>=400 && u<600)
        bill=u*1.8;
        else
        bill=u*2;
        
        if(bill<400)
        bill+=100;
        else
        bill+=(bill*0.15);
        System.out.printf("%.2f",bill);
    }
}