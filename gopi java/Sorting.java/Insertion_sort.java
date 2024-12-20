import java.util.*;

public class Insertion_sort {
    
    static void Insertion(int[] arr, int n){

        for(int i=0; i<n; i++){
            int temp = arr[i], j = i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
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

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Insertion(arr, n);
        print(arr, n);

    }
}
