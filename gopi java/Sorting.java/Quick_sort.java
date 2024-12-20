import java.util.*;


public class Quick_sort {

    static void swap(int[] arr, int s, int s1){
        int temp = arr[s];
        arr[s] = arr[s1];
        arr[s1] = temp;
    }

    static int sort(int[] arr, int low, int high){

        int i=low, j=high;
        int pivot = arr[low];
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void quick(int[] arr, int low, int high){
        if(low<high){
            int pIndex = sort(arr, low, high);
            print(arr, arr.length);
            quick(arr, low, pIndex-1);
            quick(arr, pIndex+1, high);
        }
    }

    static void print(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        print(arr, n);
        quick(arr, 0, n-1);
        print(arr, n);
    }
}

int arr[26];
int n = strlen(str);
int cnt =0;
for(int i=0; i<n; i++){
    arr[str[i]-'a']++;
}

for(int i=0; i<26; i++){
    if(arr[i]==1){
        cnt++;
    }
}

return cnt;