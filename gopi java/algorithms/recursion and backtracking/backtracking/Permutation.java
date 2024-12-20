import java.util.*;

public class Permutation {

    static void swap(int[] arr, int s, int s1){
        int t = arr[s];
        arr[s] = arr[s1];
        arr[s1] = t;
    }
    //permutation using swaping 
    /* time : O(N!*N)->n!-> generating permutations * n -> for storing it in ans
     * space: O(N)-> auxilliary stack + O(N!*N)->ans list + O(N)->list l
    */
    static void permutation(int[] arr, int index, int n, List<Integer> l, int[] vis){
        if(l.size()==n){
            System.out.println(l);
            return;
        }
        for(int i=0; i<n; i++){
            if(vis[i]==0){
                vis[i] = 1;
                l.add(arr[i]);
                permutation(arr, i+1, n, l, vis);
                l.remove(l.size()-1);
                vis[i] = 0;
            }
        }
    }
    //permutation using swaping 
    /* time : O(N!*n) 
     * space: O(N) 
    */
    static void permutation1(int[] arr, int index, int n){
        if(index==n){
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        for(int i=index; i<n; i++){
            swap(arr, i, index);
            permutation1(arr, index+1, n);
            swap(arr, i, index);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> l = new ArrayList<>();
        int[] vis = new int[n];
        permutation1(arr, 0, n);
        sc.close();
    }
}
