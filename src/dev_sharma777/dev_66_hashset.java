package dev_sharma777;
import java.util.HashSet;


public class dev_66_hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        System.out.println(set);

//        if (set.contains(1)){
//            System.out.println("set contains 1");
//        }
//        if (!set.contains(6)){/
//            System.out.println("does not contain");
//        }
//
//        set.remove(1);
//        System.out.println("we deleted 1");
    }
}
