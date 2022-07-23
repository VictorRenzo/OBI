import java.util.Scanner;

public class Drone{
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();

        if ( (A <= H && B <= L) || (A <= L && B <= H) )System.out.println("S");
        else if ( (A <= H && C <= L) || (A <= L && C <= H) ) System.out.println("S");
        else if ( (B <= H && C <= L) || (B <= L && C <= H) ) System.out.println("S");
        else System.out.println("N");
    }
}