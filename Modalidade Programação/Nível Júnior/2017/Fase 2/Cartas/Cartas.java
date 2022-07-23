import java.util.Scanner;

public class Cartas{
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int terceiraCarta = sc.nextInt();

        if (N == terceiraCarta){
            System.out.println(M);
        }
        else System.out.println(N);
    }
}