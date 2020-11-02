import java.util.Scanner;

public class Linhas{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();

    int[] order = new int[N];
    for(int i = 0; i < N; i++){
      order[i] = scan.nextInt();
    } // for para dar a ordem dos números

    int cruzamentos = 0;
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N; j++){
        if(order[i] < order[j] && j<i){
          cruzamentos++;
        }
      }// for interno
    } // for externo

    System.out.println(cruzamentos);
    } // main
} // class
