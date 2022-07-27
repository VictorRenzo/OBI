import java.util.Scanner;

public class TabuleiroSegundaResolucao{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int[][] tabuleiro = inicializaTabuleiro(N);
        tabuleiro = preencheTabuleiro(N, tabuleiro); 
        imprimeTabuleiro(tabuleiro);
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

    static int[][] preencheTabuleiro (int N, int[][] tabuleiro){
        for (int i = 1; i < N; i++){
            for (int j = 1; j < N; j++){
                tabuleiro[i][j] = preencheCelula(i, j, tabuleiro);
            }
        }
        return tabuleiro;
    }

    static int preencheCelula (int posicaoHorizontal, int posicaoVertical, int[][] tabuleiro){
        if (temMaisBrancos(posicaoHorizontal, posicaoVertical,tabuleiro)) return 1;
        else return 0;
    }

    
    static boolean temMaisBrancos (int X, int Y, int[][] tabuleiro){
        boolean possibilidade1 = tabuleiro[X-1][Y] == 0 && tabuleiro[X][Y-1] == 0;
        boolean possibilidade2 = tabuleiro[X-1][Y-1] == 0 && tabuleiro[X][Y-1] == 0;
        boolean possibilidade3 = tabuleiro[X-1][Y-1] == 0 && tabuleiro[X-1][Y] == 0;
        if (possibilidade1 || possibilidade2 || possibilidade3) return true;
        else return false;
    }

     static void imprimeTabuleiro (int[][] tabuleiro){
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro.length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}