import java.util.*;

public class Heap_sort{

    static void swap(int[] arr, int s, int s1){
        // System.out.println(s+" "+s1);
        int temp = arr[s];
        arr[s] = arr[s1];
        arr[s1] = temp;
        // System.out.println(arr[s]+" "+arr[s1]);
    }

    static void swap(List<Integer> l, int s, int s1){
        int temp = l.get(s);
        l.set(s,l.get(s1));
        l.set(s1,temp);
    }


    static void insert(List<Integer> l, int add){
        l.add(add);
        sift_Up(l, l.size(), l.size()-1);
    }

    static int remove(List<Integer> l){
        int n = l.size();
        int remove = l.get(0);

        swap(l, 0, n-1);
        remove = l.remove(l.size()-1);
        sift_Down(l, 0, l.size());
        return remove;
    }

    static void sift_Down(List<Integer> arr, int current_idx, int n){

        int child_one = 2*current_idx+1;
        while(child_one<n){
            int child_two;
            child_two = 2*current_idx+2<n?2*current_idx+2:-1;

            int idx_to_swap;
            if(child_two!=-1 && arr.get(child_two)>= arr.get(child_one)){
                idx_to_swap = child_two;
            }
            else{
                idx_to_swap = child_one;
            }

            if(arr.get(current_idx)<arr.get(idx_to_swap)){
                swap(arr, current_idx, idx_to_swap);
                current_idx = idx_to_swap;
                child_one = current_idx*2+1;
            }
            else{
                return;
            }
        }
    }


    static void sift_Up(List<Integer> arr, int n, int current_idx){
        int parent = (current_idx-1)/2;
        while(parent>=0 && arr.get(parent)<arr.get(current_idx)){
            swap(arr, parent, current_idx);
            current_idx = parent;
            parent = (current_idx-1)/2;
        }
    }

    static void sift_Up(int[] arr, int n, int current_idx){
        int parent = (current_idx-1)/2;
            while(parent>=0 && arr[parent]<arr[current_idx]){
            swap(arr, parent, current_idx);
            current_idx = parent;
            parent = (current_idx-1)/2;
        }
    }

    static void sift_Down(int[] arr, int current_idx, int n){

        int child_one = 2*current_idx+1;
        while(child_one<n){
            int child_two;
            child_two = 2*current_idx+2<n?2*current_idx+2:-1;

            int idx_to_swap;
            if(child_two!=-1 && arr[child_two]>= arr[child_one]){
                idx_to_swap = child_two;
            }
            else{
                idx_to_swap = child_one;
            }

            if(arr[current_idx]<arr[idx_to_swap]){
                swap(arr, current_idx, idx_to_swap);
                current_idx = idx_to_swap;
                child_one = current_idx*2+1;
            }
            else{
                return;
            }
        }
    }

    static void Build_heap_sift_Up(int[] arr, int n){
        

        for(int i=1; i<n; i++){
            sift_Up(arr, n, i);
        }
    }

    static void Build_heap_sift_Down(int[] arr, int n){
        int parent = (n-2)/2 ;
        for(int i=parent; i>=0; i--){
            sift_Down(arr, i, n);
        }

    }

    static void Build_heap_sift_Down(List<Integer> arr, int n){
        int parent = (n-2)/2 ;
        for(int i=parent; i>=0; i--){
            sift_Down(arr, i, n);
        }

    }

    static void print(int[] arr, int n){
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void print(List<Integer> arr, int n){
        for(int i=0; i<n; i++)
            System.out.print(arr.get(i)+" ");
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int[] arr = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // int[] brr = new int[n];
        // for(int i=0; i<n; i++)
        //     brr[i] = arr[i];

        List<Integer> l = new ArrayList<>();

        for(int i=0; i<n; i++){
            l.add(sc.nextInt());
        }

        sc.close();

        Build_heap_sift_Down(l, n);
        // Build_heap_sift_Up(brr, n);
        // print(arr,n);
        // print(brr, n);

        print(l,n);

        // for(int i=0; i<n; i++){
        //     System.out.print(remove(l)+" ");
        // }
        insert(l, 11);
        print(l, n+1);
    }
}