package Matrix_exponentiate;
import java.util.*;

public class Dice {

    static long[][] matrix_multiply(long[][] a, long[][] b){
        int n = a.length;
        long[][] ans = new long[6][6];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                long temp = 0;
                for(int k=0; k<n; k++){
                    temp+=a[i][k]*b[k][j];
                }
                ans[i][j] = temp;
            }
        }
        return ans;
    }

    static long[][] solveDice(long n){
        long[][] b = {{1,1,1,1,1,1},{1,0,0,0,0,0},{0,1,0,0,0,0},{0,0,1,0,0,0},{0,0,0,1,0,0},{0,0,0,0,1,0}};
        long[][] ans = new long[6][6];
        long[][] a={{32, 0, 0, 0, 0, 0},{16, 0,0,0,0,0},{8,0,0,0,0,0},{4,0,0,0,0,0},{2,0,0,0,0,0},{1,0,0,0,0,0}};
        if(n<=6){
            ans=matrix_multiply(a, b);
            return ans;
        }

        long rem = n-6;
        long[][] temp = new long[6][6];
        temp = solveDice(rem/2);
        ans = matrix_multiply(temp, b);
        if(n%2==1){
            ans = matrix_multiply(b, ans);
        }
        return temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[][] ans = new long[6][1];
        sc.close();
        ans = solveDice(n);
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++)
            System.out.print(ans[i][j]+" ");
            System.out.println();
        }

    }
}
