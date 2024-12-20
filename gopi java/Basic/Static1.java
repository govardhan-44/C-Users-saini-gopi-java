public class Static1 {
    public void myMethod(){
        System.out.println("hello you have used a object");
    }
    static void myinfo(){
        System.out.println("hello you have not used a object");
    }
    public static void main(String[] args){
        myinfo();
        Static1 myobj = new Static1();
        myobj.myMethod();
    }
}
