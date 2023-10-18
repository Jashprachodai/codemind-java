import java.util.*;
public class Main{
    public static void main(String[] arrr){
        Scanner ob = new Scanner(System.in);
        int x=ob.nextInt();
        int st[] = new int[x];
        for(int i=0;i<x;i++){
            st[i]=ob.nextInt();
        }
        int y=ob.nextInt();
        int et[]=new int[y];
        for(int i=0;i<y;i++){
            et[i]=ob.nextInt();
        }
        int c=0;
        int qt=ob.nextInt();
        for(int i=0;i<x;i++){
            if(st[i]<=qt && et[i]>=qt)
            c++;
        }
        System.out.print(c);
    }
}