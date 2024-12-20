import java.util.*;

public class Permutation_par {
    
    static boolean is_palindrome(int start, int end, String str){
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static void solve(String str, int index, int n, List<String> path, List<List<String>> res){
        if(index==n){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index; i<n; i++){
            if(is_palindrome(index, i, str)){
                path.add(str.substring(index, i+1));
                solve(str, i+1, n, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(str, 0, str.length(), path, res);
        System.out.println(res);
    }
}
