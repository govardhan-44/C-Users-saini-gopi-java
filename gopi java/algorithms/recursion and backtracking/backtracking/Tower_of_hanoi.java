import java.util.Scanner;

public class Tower_of_hanoi {
    
    static long toh(int n, int from, int to, int temp){
        long moves = 0;
        if(n==1){
            System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
            return 1;
        }
        moves+=toh(n-1, from, temp, to);
        moves++;
        System.out.println("move disk "+ n+" from rod "+from+" to rod "+to);
        moves+=toh(n-1, temp, to, from);
        return moves;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toh(n, 1, 2, 3));
        sc.close();
    }
}
