package JavaCollectionFramework;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("Hoa",24);
        map.put("Sơn",26);
        map.put("Anh",22);
        map.put("Toàn",20);
        map.put("Nam",24);
        map.put("Phong",27);
        Set<String> set= map.keySet();
        for (String key: set) {
            System.out.println(key +  " " + map.get(key));
        }
        Map<String,Integer> treeMap= new TreeMap<>(map);
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>(16,0.75f,true);
        linkedHashMap.put("Smint",30);
        linkedHashMap.put("Anderson",34);
        linkedHashMap.put("Lewis",29);
        linkedHashMap.put("Cook",29);
        System.out.println("\nThe age for" + " Lewis " + linkedHashMap.get("Lewis"));





    }
}
