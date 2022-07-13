import java.util.Scanner;

public class Gincana{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mdc = maiorDivisor(N,M);

        /* O problema é achor o maior valor K entre 1 e M 
            de forma que K e N sejam primos entre si
        */
        while( mdc != 1){
           M--;
           mdc = maiorDivisor(N,M); 
        }
        
        System.out.println(M);
    }

    /* Algoritmo de Euclides */
    static int maiorDivisor (int N, int M){
       int r;
       while (M != 0){
        r = N%M;
        N = M;
        M = r;
       }
       
       return N;
    }
}