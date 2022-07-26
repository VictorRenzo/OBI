/* Passa nos testes dados, mas estou com dificuldade em dizer se está realmente correto */
import java.util.Scanner;

public class Tabuleiro{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int N = sc.nextInt();
        int[][] tabuleiro = inicializaTabuleiro(N);
        System.out.println(preencheCelula(N-1, tabuleiro)); 
        //imprimeTabuleiro(tabuleiro);        
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
    
    static int preencheCelula (int N, int[][] tabuleiro){
        if (temMaisBrancos(N, tabuleiro)) return 1;
        else if (!temMaisBrancos(N, tabuleiro) && !temVazio(N, tabuleiro)) return 0;  
        else return preencheCelula(N-1, tabuleiro);
    }

    static boolean temMaisBrancos (int N, int[][] tabuleiro){
        boolean possibilidade1 = tabuleiro[N-1][N] == 0 && tabuleiro[N][N-1] == 0;
        boolean possibilidade2 = tabuleiro[N-1][N-1] == 0 && tabuleiro[N][N-1] == 0;
        boolean possibilidade3 = tabuleiro[N-1][N-1] == 0 && tabuleiro[N-1][N] == 0;
        if (possibilidade1 || possibilidade2 || possibilidade3) return true;
        else return false;
    }

    static boolean temVazio (int N, int[][] tabuleiro){
        if (tabuleiro[N-1][N] != 9 && tabuleiro[N-1][N-1] != 9 && tabuleiro[N][N-1] != 9) return false;
        else return true;
    }

    /*static void imprimeTabuleiro (int[][] tabuleiro){
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro.length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println(" ");
        }
    }*/
}