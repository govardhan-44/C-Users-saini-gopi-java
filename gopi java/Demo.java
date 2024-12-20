import java.util.Scanner;

public class Demo {

    static void swap_if_greater(int[] a, int[] b, int ind1, int ind2){
        if(a[ind1] > b[ind2]){
            int temp = a[ind1];
            a[ind1]=b[ind2];
            b[ind2]=temp;
        }
    }
    public static void mergeTwoSortedArraysWithoutExtraSpace(int []a, int []b){
        // Write your code here.
        int m = a.length;
        int n = b.length;

        int len = (n+m);

        int gap = (len/2)+(len%2);
        System.out.println("gap array1 array2");
        while(gap>0){
            int left =0;
            int right = gap;
            System.out.println(gap);
            System.out.println();
            for(int i=0; i<m; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            for(int i=0; i<n; i++){
                System.out.print(b[i]+" ");
            }
            
            System.out.println();
            
            System.out.println();
            System.out.println();
            
            while(right<len){
                // a, b
                if(left<m && right>=m){
                    swap_if_greater(a, b, left, right-m);
                }

                // b,b
                else if(left>=m){
                    swap_if_greater(b, b, left-m, right-m);
                }

                // a,a
                else{
                    swap_if_greater(a, a, left, right);
                }
                left++;
                right++;
            }
            if(gap==1)break;
            gap = (gap/2)+(gap%2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b = new int[m];

        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        sc.close();

        mergeTwoSortedArraysWithoutExtraSpace(a, b);
    }
}