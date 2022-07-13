import java.util.Scanner;

public class Medalhas{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int T3 = sc.nextInt();
    
        int[] times = new int[3];
        times[0] = T1;
        times[1] = T2;
        times[2] = T3;

        int max = 0;
        int max_index = 0;

        int min = 1001;
        int min_index = 0;
        for (int i = 0; i < 3; i++){
            if(times[i] > max) {
                max = times[i];
                max_index = i;
            }    
            if (times[i] < min) {
                min = times[i];
                min_index = i;
            }
        }

        System.out.println(max_index);
        System.out.println(5 - max_index - min_index);
        System.out.println(min_index);


    }

}