import java.util.Scanner;

public class ParImpar{
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int P = sc.nextInt();
        int D_1 = sc.nextInt();
        int D_2 = sc.nextInt();

        int sum = D_1 + D_2;
        int result = sum%2;

        if ( (P == 0 && result == 0) || (P == 1 && result == 1) ){
            System.out.println("0");
        }    
        else {
            System.out.println("1");
        }
    }
}