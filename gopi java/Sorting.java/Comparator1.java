import java.util.*;

public class Comparator1 {
    static void print(int[][] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print("[");
            for(int j=0; j<2; j++)
                System.out.print(arr[i][j]+", ");
            System.out.print("] ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1},{1, 2},{5,6},{9,10},{3,4}};
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        
        print(arr, 5);
    }
}
