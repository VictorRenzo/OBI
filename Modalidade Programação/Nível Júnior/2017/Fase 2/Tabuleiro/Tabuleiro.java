/* não está pronto, pretendo resolver com recursão/backtracking */
import java.util.Scanner;

public class Tabuleiro{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int N = sc.nextInt();
        int[][] tabuleiro = inicializaTabuleiro(N);
         
    }
  
    static int[][] inicializaTabuleiro(int N){
        int[][] tabuleiro = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                tabuleiro[i][j] = sc.nextInt();
            }
        }

        return tabuleiro;
    }
    
    static int preencheCelula (int N, int[] tabuleiro){
        boolean haMaisBrancosVizinhos = temMaisBrancos();
        if (estaVazio(N-1)) preencheCelula(N-1, tabuleiro);
        else
        if (haMaisBrancosVizinhos) return 1;
        else if (tabuleiro[N-1][N] == 9) preencheCelula
    }

    static boolean temMaisBrancos (int N, int[] tabuleiro){
        boolean possibilidade1 = tabuleiro[N-1][N] == 0 && tabuleiro[N][N-1] == 0;
        boolean possibilidade2 = tabuleiro[N-1][N-1] == 0 && tabuleiro[N][N-1] == 0;
        boolean possibilidade3 = tabuleiro[N-1][N-1] == 0 && tabuleiro[N-1][N] == 0;
        if (possibilidade1 || possibilidade2 || possibilidade3) return true;
        else return false;
    }

    static boolean estaVazio (int N, int[] tabuleiro){
        if (tabuleiro[N][N])
    }
}