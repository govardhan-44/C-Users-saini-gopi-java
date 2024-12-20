import java.util.*;

public class Merge_sort {
    
    static void Merge(int[] arr, int low, int high, int mid){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }

        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
    }

    static void sort(int[] arr, int low, int high){
        if(low>=high) 
            return;
        int mid = (low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        Merge(arr, low, high, mid);
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

        sort(arr, 0, n-1);
        print(arr, n);
    }
}

int cnt = 0;
int n= strlen(W);

for(int i=0; i<n; i++){
    char c = [i][strlen(W[i])-1];
    if()
}