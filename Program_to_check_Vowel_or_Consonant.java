import java.util.Scanner;
public class Main{
    public static void main(String[] ar){
        Scanner ob = new Scanner(System.in);
        char t = ob.next().charAt(0);
        if(t=='A' || t=='E' || t=='I' || t=='O' || t=='U' || t=='a' || t=='e' || t=='i' || t=='o' || t=='u')
        System.out.print("Vowel");
        else
        System.out.print("Consonant");
    }
}