package dev_sharma777;

import java.util.*;

public class dev_54_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(17);

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(0,5);
        l1.addAll(l2);
        System.out.println(l1.contains(9));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.removeLast());
        System.out.println(l1.stream());
       for (int i =0; i< l1.size(); i++) {
           System.out.print(l1.get(i));
           System.out.print(" ,");
       }
    }
}
