import java.util.Scanner;

public class Arquivos2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int B = scan.nextInt();

    // inicializando array com o tamanho dos arquivos
    int[] files = new int[N];
    for(int i = 0; i < N; i++){
      files[i] = scan.nextInt();
    }

    //colocando em ordem decrescente
    for(int i = 0;i < N; i++){
      for(int j = i+1; j<N; j++){
        int t = 0;
        if(files[i] < files[j]){
            t = files[i];
            files[i] = files[j];
            files[j] = t;
        } // if de rearranjo
      } // for interno
    } // for externo

    int dir = 0;
    for(int i = 0; i < N; i++){
      if(files[i] == B) { dir++;
      }
      else{
        for(int j = i+1; j<N; j++){
          int k = files[i] + files[j];
          if (k == B){dir++; break;}
        }
      }
    }
    System.out.println(dir);
  }
}
