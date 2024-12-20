public class Expression{

    static int solveExpression(String str, int ways, int i, int j, short s){
        if(i==j){
            if(str.charAt(i)=='T' && s==1){
                return 1;
            }
            if(str.charAt(i)=='F' && s==0){
                return 1;
            }
            return 0;
        }
        for(int g=1; g<=j-1; g+=2){
            int lt = solveExpression(str, ways, i, j, s)
        }
        return ways;
    }

    public static void main(String[] args){
    

    }
}