import java.util.*;
public class Pascal_triangle {
    static List<Long> generate_row(int r){
        List<Long> l = new ArrayList<>();
        l.add((long)1);
        long ans = 1;
        for(int i=1; i<r; i++){
            ans*=(r-i);
            ans/=i;
            l.add(ans);
        }
        return l;
    }
    static long ncr(int r, int c){
        //  r = r-1;
        //  c = c-1;
        long ans = 1;
        for(int i=0; i<c; i++){
            ans*=(r-i);
            ans/=i+1;
        }
        return ans;
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            System.out.println(generate_row(i));
        }
    }
}
