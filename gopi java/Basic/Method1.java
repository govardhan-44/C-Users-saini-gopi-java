public class Method1 {
    static int add( int x, int y){
        return x+y;
    }
    static float add( float x, float y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.println(add(2,8));
        System.out.println(add(2.5f, 7.5f));
    }
}
