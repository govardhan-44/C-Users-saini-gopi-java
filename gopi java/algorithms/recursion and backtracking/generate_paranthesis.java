import java.util.*;
public class generate_paranthesis {
    static void generate(int open, int close, int n, String l){
        if(l.length()==2*n){
            System.out.println(l);
            return;
        }
        if(open<n){
            //l.add('(');
            generate(open+1, close, n, l+"(");
        }
        if(close<open){
            generate(open, close+1,  n, l+")");
            
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       // List<String> l = new ArrayList<>();
        generate(0, 0, n, "");
    }
}
