import java.util.*;

public class Maximum_no_array {

    static void swap(int[] arr, int s, int s1){
        int t = arr[s];
        arr[s] = arr[s1];
        arr[s1] = t;
    }
    
    static boolean less(int[] arr, int i, int j){
       
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr, new Comparator<>(
            public static int compare(int i, int j){
             String ij = Integer.toString(i) +Integer.toString(j);
            String ji = Integer.toString(j)+ Integer.toString(i);
        //System.out.println(ij+" "+ji);
            }
        }
        ));
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(less(arr, i, j)){
                    swap(arr, i, j);
                }
            }
            //System.out.print(arr[i]+" ");
        }
        //System.out.println(less(arr, 0, 1));
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
