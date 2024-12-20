import java.util.*;
public class Hashmap1 {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("c", 1);
        map.put("billllll", 1);
        map.put("gopi", 1);

        map.replace("billllll", 10000);
        map.replace("gopi", 21);
        System.out.println(map);
    }
}
