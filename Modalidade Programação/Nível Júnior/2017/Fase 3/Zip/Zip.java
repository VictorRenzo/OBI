import java.util.Scanner;

public class Zip{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int primeiraCartaLia = sc.nextInt();
        int segundaCartaLia = sc.nextInt();
        int primeiraCartaCarolina = sc.nextInt();
        int segundaCartaCarolina = sc.nextInt();

        if (calculaPontos(primeiraCartaLia, segundaCartaLia) > calculaPontos(primeiraCartaCarolina, segundaCartaCarolina)){
            System.out.println("Lia");
        }
        else if (calculaPontos(primeiraCartaLia, segundaCartaLia) < calculaPontos(primeiraCartaCarolina, segundaCartaCarolina)){
            System.out.println("Carolina");
        }
        else System.out.println("empate");
    }

    static int calculaPontos (int primeiraCarta, int segundaCarta){
        if (primeiraCarta == segundaCarta) return 2*(primeiraCarta + segundaCarta);
        else if (primeiraCarta == (segundaCarta + 1) && primeiraCarta == (segundaCarta - 1)) return 3*(primeiraCarta + segundaCarta);
        else return primeiraCarta + segundaCarta;
    }
}