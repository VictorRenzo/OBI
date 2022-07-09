import java.util.Scanner;

public class Mobile{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();

    if(A == B+C+D && B+C == D && B == C){
      System.out.println("S");
    }
    else{
      System.out.println("N");
    }


  } 
} 
