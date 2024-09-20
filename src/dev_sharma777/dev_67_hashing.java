package dev_sharma777;

import java.util.*;

public class dev_67_hashing {
    public static void main(String[] args) {
     HashMap<String,Integer>map = new HashMap<>();

     map.put("india", 130);
     map.put("usa",50);
     map.put("china", 150);
        System.out.println(map);

        map.put("usa",60);
        System.out.println(map);

        map.put("canada",70);
        System.out.println(map);

        map.remove("canada");
        System.out.println(map);


//        if (map.containsKey("russia")){
//            System.out.println("key is present in the map");
//        }
//        else {
//            System.out.println("not present in the map");
//        }
//
//        System.out.println(map.get("india"));
//        System.out.println(map.get("russia"));

    }

}
