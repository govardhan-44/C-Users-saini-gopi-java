import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Board {
    static void construct(){
         Scanner sc = new Scanner(System.in);
        //int no_of_snakes;
        
        int no_of_snakes = sc.nextInt();
        //int n = no_snakes;
        Map<Integer, Integer> snakes = new HashMap<>();
        while(no_of_snakes>=1){
            no_of_snakes--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            snakes.put(a, b);
        }


        int no_of_ladders = sc.nextInt();
        Map<Integer, Integer> ladders = new HashMap<>();
        while(no_of_ladders>=1){
            no_of_ladders--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            ladders.put(a, b);
        }
        sc.close();
        System.out.println(snakes);
        System.out.println(ladders);
    }

    // static int snakes()
    public static void main(String[] args){
        construct();
    }
}
