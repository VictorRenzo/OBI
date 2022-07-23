import java.util.Scanner;

public class Montanha{
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int N = sc.nextInt();
        int[] sequencia = guardaSequencia(N);
        if (haMaisDeUmPico(sequencia)) System.out.println("S");
        else System.out.println("N");
    }

    static int[] guardaSequencia (int N){
        int[] sequencia = new int[N];
        for (int i = 0; i < N; i++){
            sequencia[i] = sc.nextInt();
        }

        return sequencia;
    }

    static boolean haMaisDeUmPico (int[] sequencia){
        int contaPicos = 0;
        for (int i = 1; i <= sequencia.length - 2; i++){
            if (sequencia[i] > sequencia[i-1] && sequencia[i] > sequencia[i+1]) contaPicos++;
        }
        
        if (contaPicos > 1) return true;
        else return false;
    }
}