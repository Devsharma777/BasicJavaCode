package dev_sharma777;

import java.util.ArrayList;
import java.util.LinkedList;

public class dev_55_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(17);

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(0,5);
        l1.addAll(l2);
        l1.addLast(676);
        l1.addFirst(55);
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
