import java.util.Scanner;

public class Bondinho{
    static Scanner sc = new Scanner (System.in);

    public static void main (String[] args){
        int A = sc.nextInt();
        int M = sc.nextInt();
        int total = A+M;
        if (total <= 50) System.out.print("S");
        else System.out.println("N");
    }
}