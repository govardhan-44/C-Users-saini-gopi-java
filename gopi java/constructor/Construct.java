public class Construct {
    String name1;
    int age1;
    //System.out.println(name1+" "+age);
    public Construct(String name, int age){
        name1 = name;
        age1 = age;
    }
    public static void main(String[] args){
        Construct myobj = new Construct("gopi", 21);
        System.out.println(myobj.name1+"\'s age is "+myobj.age1);
    }
}
