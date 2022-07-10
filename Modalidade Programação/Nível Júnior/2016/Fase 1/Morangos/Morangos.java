import java.util.Scanner;

public class Morango{
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args){
        int comprimento1 = sc.nextInt();
        int largura1 = sc.nextInt();
        int area1 = calculaArea(comprimento1, largura1);

        int comprimento2 = sc.nextInt();
        int largura2 = sc.nextInt();
        int area2 = calculaArea(comprimento2, largura2);

        System.out.println(comparaArea(area1,area2));
    }

    int calculaArea (int comprimento, int largura){
        return comprimento*largura;
    }

    int comparaArea (int area1, int area2){
        if (area1 >= area2) return area1;
        else return area2;
    }
}