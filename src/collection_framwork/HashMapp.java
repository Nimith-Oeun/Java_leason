package collection_framwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapp {
    public static void main(String[] args) {
        Map<Integer, String> map
                = new HashMap<>();
        // add element to map
        map.put(1,"Apple");
        map.put(2,"Water");
        map.put(3, "Drink");
        System.out.println(map);
        // list all keys in map
        Set<Integer> keys = map.keySet();
        System.out.println("All keys: "  +  keys);
        Collection<String> values = ( map.values());
        System.out.println("All value in map: " + values);
        //Loop through map
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        //remove element from map
        System.out.println("Remove element with key 2");
        map.remove(2);
        System.out.println(map);
    }


}
