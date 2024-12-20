import java.util.*;

public class Radix{


    static int how_many_Digits(int[] arr, int n){

        int digits = 0;
        int maximum = 0;
        for(int i=0; i<n; i++){
            maximum = Math.max(maximum, arr[i]);
        }

        while(maximum>=1){
            digits++;
            maximum/=10;
        }

        return digits;
    }
      


    static void radix_Sort(int[] arr, int n, int digit){
        
        int[] temp = new int[n];
        int[] count = new int[10];

        for(int i=0; i<n; i++){
            count[arr[i]/digit%10]++;
        }
        // System.out.println("count");

        for(int i=1; i<10; i++){
            count[i]+=count[i-1];
        }
        // System.out.println("fill");

        for(int i=n-1; i>=0; i--){
            temp[count[arr[i]/digit%10]-1] = arr[i];
            count[arr[i]/digit%10]--;
        }
        // System.out.println("hello");

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
        // System.out.println("last");
    }

    static void Print(int[] arr, int n){

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        int digits = how_many_Digits(arr, n);

        int digit = 1;
        // System.out.println(digits);

        while(digits>=1){
            digits--;
            radix_Sort(arr, n, digit);
            digit*=10;
        }

        Print(arr, n);
    }
}