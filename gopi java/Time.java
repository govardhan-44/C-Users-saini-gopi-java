import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        long t1 = System.nanoTime();
        double limit = Math.pow(10, 6);
        //System.out.println(limit);
        int[] a = new int[(int)limit];
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<limit; i++){
            a[i] = sc.nextInt();
            //System.out.println(i);
        }
        long t2 = System.nanoTime();
        
        System.out.println((t2-t1)/1000000+"ms");
    }
}
