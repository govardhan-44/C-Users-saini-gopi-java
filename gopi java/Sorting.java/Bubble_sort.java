import java.util.*;
public class Bubble_sort {

    static void swap(int[] arr, int s, int s1){
        int temp = arr[s];
        arr[s] = arr[s1];
        arr[s1] = temp;
    }
    
    static void Bubble(int[] arr, int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
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

        Bubble(arr, n);
        print(arr, n);
    }
}
