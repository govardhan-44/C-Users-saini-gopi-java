package Matrix_exponentiate;
import java.util.*;
public class Fibonaci {
    static int op = 0;
    static long[][] matrix_Multiply(long[][] a, long[][] b){
        int mod = 1000000007;
        int n = a.length;
        long[][] ans = new long[n][n]; 
        for(int i=0; i<n; i++){
            for (int j = 0; j < n; j++) {
                long temp = 0;
                for (int k = 0; k < n; k++) {
                    temp+=(a[i][k]%mod*b[k][j]%mod)%mod;
                }
                ans[i][j] = temp;
            }

        }
        return ans;
    }

    static long[][] fibonaci(long[][] a, long n1){
        op++;
        int n = a.length;
        long[][] ans = new long[n][n];
        if(n1==0){
            for (int i = 0; i < n; i++) {
                ans[i][i] = 1;
            }
            return ans;
        }
        if(n1==1){
            ans[0][0] = 1;
            ans[0][1] = 1;
            ans[1][0] = 1;
            ans[1][1] = 0;
            return ans;
        }
        long[][] temp = fibonaci(a, n1/2);
        ans = matrix_Multiply(temp, temp);
        if(n1%2==1){
            ans = matrix_Multiply(a, ans);
        }
        return ans;
    }

    public static void main(String[] args){
        long t1 = System.currentTimeMillis();
        long[][] a = {{1, 1}, {1, 0}};
        long[][] ans = fibonaci(a, 1000000000000000000L);
        long t2 = System.currentTimeMillis();

        System.out.println(op);
        
        System.out.println(t2-t1+"ms");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println(ans[0][0]);
    }
}
