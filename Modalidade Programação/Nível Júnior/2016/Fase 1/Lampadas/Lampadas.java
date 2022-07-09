import java.util.Scanner;

public class Lampadas{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int N = sc.nextInt();
        boolean[] initialState = new boolean[2];
        for (int i = 0; i < N; i++){
            int change = sc.nextInt();
            if (change == 1){
                initialState[0] = !initialState[0]; 
            }
            else {
                initialState[0] = !initialState[0]; 
                initialState[1] = !initialState[1];
            }
        }

        if (initialState[0] == false && initialState[1] == false){
            System.out.println("0");
            System.out.println("0");
        }
        else if (initialState[0] == false && initialState[1] == true){
            System.out.println("0");
            System.out.println("1");
        }
        else if (initialState[1] == false && initialState[0] == true){
            System.out.println("1");
            System.out.println("0");
        }
        else{
            System.out.println("1");
            System.out.println("1");
            
        }
    }
 }
