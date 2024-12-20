package SubArray;

import java.util.Scanner;

public class Print_max_sum_sub_array {
    
    static int[] Kadanes(int[] arr, int n){

        int start = -1, end= -1;
        int sum=0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){

            if(sum==0)
                start =i;
            sum+=arr[i];

            if(max<sum){
                max= Math.max(max, sum);
                end = i;
            }
            if(sum<0)
                sum = 0;
        }
        return new int[] {start, end};
    }

    static void print(int[] arr, int n, int start, int end){
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int t = currentTimeinmillis();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        sc.close();
        
       int[] temp =  Kadanes(arr, n);

       print(arr, n, temp[0], temp[1]);
    }
}
