//package Binary trees;
import java.util.*;



public class BinaryTree {
    
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
        public Node(int data, int left, int right){
            this.data = data;
            this.left.data = left;
            this.right.data = right;
        }
    }
    
    static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int i = 0;
        int left = low;
        int right = mid+1;
        //int h = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i++] = arr[left++]; 
            }
            else{
                temp[i++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[i++] = arr[left++];
        }
        while(right<=high){
            temp[i++] = arr[right++];
        }
        for(int k=low; k<=high; k++){
            arr[k] = temp[k-low];
            //System.out.print(temp[k-low]+" ");
        }
        //System.out.println();
        //return temp;
    }

    static void merge_sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void levelorder(Node root, int level, Map<Integer, List<Integer>> l){
        //System.out.println(level);
        if(root == null){
            //System.out.println("root == null");
            return;
        }
        if(l.get(level)!=null)
            l.get(level).add(root.data);
        else{
            l.put(level, new ArrayList<>());
            l.get(level).add(root.data);
        }
        levelorder(root.left, level+1, l);
        levelorder(root.right, level+1, l);
    }

    static void print(Node root){
        Map<Integer, List<Integer>> l = new HashMap<>();
        levelorder(root, 0, l);
        //System.out.println(l);
        for(Map.Entry<Integer, List<Integer>> e: l.entrySet()){
            //int k = e.getKey();
            for(Integer i:e.getValue()){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static Node insert(Node root, int x){
        if(root == null){
            root = new Node(x);
            return root;
        }
       if(x <= root.data){
            root.left = insert(root.left, x);
       }
       else{
            root.right = insert(root.right, x);
       }
       return root;
    }

    public static void main(String[] args){
        //BinaryTree bt = new BinaryTree();
        Node root = null;
        root = insert(root, 4);
        //insert(root, 4);
        insert(root, 3);
        insert(root, 2);
        insert(root, 1);
        insert(root, 5);
        insert(root, 6);
        insert(root, 7);
        //System.out.println("1" + root);
        //print(root);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
