import java.util.*;

public class Backtracking{
    
    static void subset(List<Integer> l, int i, List<Integer> l1, List<List<Integer>> res){

        res.add(new ArrayList<>(l1));

        for( int j = i; j < l.size(); j++){

            l1.add(l.get(j));
            //System.out.print(i+" ");
            subset(l, j+1, l1, res);
            //System.out.print(" j "+ j+" "+l1+" ");
            l1.remove(l1.size()-1);
            
        }

    }

    static List<List<Integer>> printsubset(List<Integer> l){

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        subset(l, 0, l1, res);
        return res;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        //System.out.println(g);
        sc.close();

       // java;
        List< Integer> l = List.of(1, 2, 3);
        List< List<Integer> > res = printsubset(l);
        
         for(List<Integer> it: res){
            for( Integer j: it){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
    }
}

/*
 * 
 * 
 * import java.util.*;

public class Backtracking {
    
    public static void subset( int[] arr, int i, List<List<Integer>> res, List<Integer> l ){

        res.add(new ArrayList<>(l));

        for( int j=i; j<arr.length; j++){
            
            l.add(arr[j]);
            subset( arr, j+1, res, l);
            l.remove(l.size()-1);

        }

    }

    public static List<List<Integer>> print1(int[] arr){

        List<Integer> l = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        subset(arr , 0, res, l);
        return res;
    }

    public static void main(String[] args){

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        
        List<List<Integer>> ans = print1(arr);

        for( List<Integer> i: ans){

            for( Integer j: i){
                System.out.print( j + " ");
            }
            System.out.println("");
        }

    }


}

 * 
 * 
 */