import java.util.*;

public class Codigo{
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String[] args){
        int N = sc.nextInt();
        int[] entrada = recebeEntrada(N);
        int resposta = analisaEntrada(entrada);
        System.out.println(resposta);
    }
    
    static int[] recebeEntrada(int N){
        int[] entrada = new int[N];
        for (int i = 0; i < N; i++){
            entrada[i] = sc.nextInt();
        }
       return entrada;
    }

    static int analisaEntrada (int[] entrada){
        int count = 0;
        for (int i = 0; i < entrada.length - 2; i++){
            if (ehSequencia100(i, entrada)) count++;
        }

        return count;
    }

    static boolean ehSequencia100(int i, int[] entrada){
        if (entrada[i] == 1 && entrada[i+1] == 0 && entrada[i+2] == 0) return true;
        else return false;
    }
}

