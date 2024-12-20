import java.util.*;


public class Main{

    static int g=0;
    static List<List<List<Integer>>> res;
    static int no_of_answers = 0;
    static boolean is_possible(int k, int[][] table, int row, int col){

        for(int i=0; i<9; i++){
            if(table[row][i]==k)
                return false;
        }

        for(int i=0; i<9; i++){
            if(table[i][col]==k)
                return false;
        }

        for(int i=0; i<9; i++){
            if(table[3*(row/3)+i/3][3*(col/3)+i%3]==k)
                return false;
        }
        return true;
    }

    static void print(List<List<List<Integer>>> ans){
        for (int index = 0; index < 2; index++) {
            for (int index1 = 0; index1 < 9; index1++) {
                for(int i=0; i<9; i++){
                    System.out.print(ans.get(index).get(index1).get(i)+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }

    static void print1(List<List<Integer>> ans){
        System.out.println("g "+g);
        // System.out.println(g);
        System.out.println("ans "+no_of_answers);
        for (int index = 0; index < 100; index++) {
            for (int index1 = 0; index1 < 9; index1++) {
                System.out.print(ans.get(index).get(index1)+" ");
            }
            System.out.println();
        }
    }

    static void print(int[][] ans){
        for (int index = 0; index < 9; index++) {
            for (int index1 = 0; index1 < 9; index1++){
                System.out.print(ans[index][index1]+" ");
            }
            System.out.println();
        }
    }

    static boolean solve(int[][] table){
        
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(table[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(is_possible(k,table,i,j)){
                            table[i][j]=k;
                            if(solve(table))
                                g++;
                                
                                // return true;
                            // else
                            table[i][j]=0;
                            
                            // return false;
                        }
                       
                    }
                    return false;
                }
                
            }
        }

        // // System.out.println("ans");
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int index = 0; index < 9; index++) {
        //     List<Integer> l1= new ArrayList<>();
        //     for (int index1 = 0; index1 < 9; index1++) {
        //         l1.add(table[index][index1]);
        //     }
        //     ans.add(l1);
        // }
        // no_of_answers++;
        // System.out.println("Filling data into the result");
        // res.add(ans);
        // // print1(ans);
        
        return true;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[9][9];
        for (int index = 0; index < 9; index++) {
            for (int index1 = 0; index1 < 9; index1++) {
                // System.out.println(sc.nextInt());
                table[index][index1]=sc.nextInt();
            }
        }
        sc.close();
        // int n=100;
        // List<List<List<Integer>>> res= new ArrayList<>();
        // // print(table);
        // g=0;
        // no_of_answers=0;
        // System.out.println("Entering solve func");
        // solve(table);
        // System.out.println("Trying to print res");
        // print(res);
        // print(ans);
        System.out.println(g);
    }
}