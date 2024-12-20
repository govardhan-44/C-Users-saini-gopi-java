import java.util.*;

public class Selection_sort {
    
    static void swap(int[] arr, int s, int s1){
        int temp = arr[s];
        arr[s] = arr[s1];
        arr[s1] = temp;
    }

    static void Selection(int[] arr, int n){
        for(int i=0; i<n; i++){
            int mini = i;
            int min = arr[i];
            for(int j=i; j<n; j++){
                if(arr[j]<arr[mini]){
                    min = Math.min(min, arr[j]);
                    mini = j;
                }
            }
            swap(arr, i, mini);
        }
    }

    static void print(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int t = currentTimeinmillis();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        sc.close();
        Selection(arr, n);
        print(arr, n);
    }
}
