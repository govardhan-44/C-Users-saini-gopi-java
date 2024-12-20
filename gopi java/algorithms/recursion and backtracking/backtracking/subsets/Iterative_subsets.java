package backtracking.subsets;

import java.util.*;

public class Iterative_subsets {
    
    static void Iterative_sub_sets(int[] arr, int n){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<Math.pow(2, n); i++){
            int j = i;
            int k=0;
            List<Integer> l = new ArrayList<>();
            while(j>=1){
                if((j&1)==1){
                    l.add(arr[k]);

                }
                k++;
                j/=2;
            }
            res.add(l);
        }
        Collections.sort(res, new Comparator<List<Integer>>() {
            public int compare(List<Integer> a, List<Integer> b){
                return a.get(0)-b.get(0);
            }
        });
        for(List<Integer> l: res){
            System.out.println(l);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Iterative_sub_sets(arr, n);

    }
}
