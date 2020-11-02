import java.util.Scanner;

public class Million{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int days = scan.nextInt();
    int i = 0;
    int sum = 0;
    int x;
    int d = 0;
    while (i < days){
      x = scan.nextInt();
      sum = sum+x;
      i++;
      if(sum >= 1000000 && d == 0){
        d = i;
      } //if sum
    } //while
    System.out.println(d);
    scan.close();
  } //main
} // class
