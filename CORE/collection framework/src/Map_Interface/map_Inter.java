package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class map_Inter {
    static void main() {
        // part of collections framework (lib) doesn't extend Collection interface
        // unique keys values can be same
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        System.out.println(map.put("B",2));
        map.put("C",3);
        System.out.println(map.put("C",4));/// return null or previous value of key (if present)
        /// this updates value of existing key doesn't cause duplication
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("A"));// returns value
        System.out.println(map.containsKey("A"));// check for a particular key
        System.out.println(map.containsValue(4));// check for a particular value
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.remove("A"));// returns value associated in map or null if not in map and remove
        System.out.println(map.remove("F"));
        System.out.println(map);
        for (String s : map.keySet()) {
            System.out.println(s+":"+map.get(s));

        }
    }
}
