import java.util.Scanner;

public class Helicopter{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args)
    {
        int H = sc.nextInt();
        int P = sc.nextInt();
        int F = sc.nextInt();
        int D = sc.nextInt();
        
        switch(D){
            case -1:
                if (distanciaHoraria(F,H) > distanciaHoraria(F,P)){
                    System.out.println("N");
                }
                else System.out.println("S");
                break;
            case 1:
                if (distanciaAntiHoraria(F,H) > distanciaAntiHoraria(F,P)){
                    System.out.println("N");
                }
                else System.out.println("S");
                break;
            default:
                break;
        }
    }

    static int distanciaHoraria (int posicao1, int posicao2)
    {
        if (posicao1 > posicao2){
            return posicao1 - posicao2;
        }
        else{
            return posicao1 - posicao2 + 16;
        }
    }

    static int distanciaAntiHoraria (int posicao1, int posicao2){
         if (posicao1 > posicao2){
            return posicao1 - posicao2 + 16;
        }
        else{
            return posicao2 - posicao1;
        }
    }
}