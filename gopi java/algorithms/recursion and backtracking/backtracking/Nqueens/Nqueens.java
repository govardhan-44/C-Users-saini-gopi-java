import java.util.*;
 public class Nqueens{
    static int ispossible(int i, int j, int n, int[] col, int[] dlv, int[] drv){
        //column checking
        if(col[j]==1){
            return 0;
        }

        //checking diagonal left
        if(dlv[n-1+i-j]==1){
            return 0;
        }

        //checking diagonal right
        if(drv[i+j]==1){
            return 0;
        }

        return 1;
    }

    static List<String> construct(char[][] vis){
        List < String > res = new ArrayList < String > ();
        for (int i = 0; i < vis.length; i++) {
            String s = new String(vis[i]);
            res.add(s);
        }
        return res;
    }
    
    static void queen( int index, int n, List<List<String>> ans, List<String> l1, char[][] vis, int[] col, int[] dlv, int[] drv){
        if(index==n){
            ans.add(construct(vis));
            return;
        }

        for(int j = 0; j<n; j++){
            if(ispossible(index, j, n, col, dlv, drv)==1){
                l1.add("Q");
                vis[index][j] = 'Q';
                col[j]=1;
                dlv[n-1+index-j]=1;
                drv[index+j]=1;
                queen(index+1, n, ans, l1, vis, col, dlv, drv);
                l1.remove(l1.size()-1);
                vis[index][j] = '.';
                col[j]=0;
                dlv[n-1+index-j]=0;
                drv[index+j]=0;
            }
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        List<List<String>> ans = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        char[][] vis = new char[n][n];
        int[] col = new int[n];
        int[] dlv = new int[2*n-1];
        int[] drv = new int[2*n-1];

        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                vis[i][j] = '.';
            }
        }

        queen(0, n, ans, l1, vis, col, dlv, drv);
        for(List<String> i: ans){
            System.out.println(i);
        }

    }
 }