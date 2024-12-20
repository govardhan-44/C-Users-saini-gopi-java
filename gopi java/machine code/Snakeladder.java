//package machine code;

import java.util.*;
// import java.util.Random;
public class Snakeladder extends Board{

    static int dicethrow(){
        Random random = new Random(0);
        return (int)(random.nextInt(1, 7));
    }

    static int nextTurn(int index){
        return index%2;
    }
    public static void main(String[] args){

        //int[][] board = new int[100][10];
       
        //Map<Integer, Integer> players = new HashMap<>();
        int srinu = 0;
        int gopi = 0;
        int no = 0;
        System.out.println("gopi :"+gopi+" "+ " srinu:" + srinu);
        while(true){
            
            if(srinu==100||gopi==100){
                if(srinu==100){
                    System.out.println("srinu won the game");
                    break;
                }
                System.out.println("gopi won the game");
                break;
            }
            no++;
            if(nextTurn(no)==0){
                int dice = dicethrow();
                System.out.println("gopi :"+gopi+" "+dice+" "+(gopi+dice));
                
                if(gopi+dice<=100){
                    if(gopi==100){
                        System.out.println("gopi won the game");
                        break;
                    }
                    else{
                        gopi+=dice;
                        if(snakes.get(gopi)!=null){
                            gopi = snakes.get(gopi);
                            System.out.println("gopi bitten by a snake");
                        }
                        if(ladders.get(gopi)!=null){
                            gopi = ladders.get(gopi);
                            System.out.println("gopi got a ladder");
                        }
                    }
                }
            }
            else{
                int dice = dicethrow();
                System.out.println("srinu :"+ srinu+" "+dice +" " +(srinu+dice));
                if(srinu+dice<=100){
                    if(srinu==100){
                        System.out.println("srinu won the game");
                        break;
                    }
                    else{
                        srinu+=dice;
                        if(snakes.get(srinu)!=null){
                            srinu = snakes.get(srinu);
                            System.out.println("srinu bitten by a snake");
                        }
                        if(ladders.get(srinu)!=null){
                            srinu = ladders.get(srinu);
                            System.out.println("srinu got a ladder");
                        }
                    }
                }
            }
        }
    }
}
