import java.util.Scanner;
import java.util.Arrays;

public class Fita{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] fita = new int[n];

    for (int i = 0; i < n; i++){
        fita[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        if (fita[i] == 0){
            int d = Math.abs(i-j);
            if (d <= 9 && (fita[j] == -1 || d < fita[j])) {
              fita[j] = d;
            } 
            else if (fita[j] == -1 || d < fita[j]){
              fita[j] = 9;
            } // loop do else if
        } // loop do primeiro if
      } // loop interno do for
    } // loop externo do for

    for(int k = 0; k < n; k++){
      System.out.print(fita[k] + " ");
    }

  } // main
} // class
