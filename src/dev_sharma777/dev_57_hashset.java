package dev_sharma777;

import java.util.HashSet;

public class dev_57_hashset {
    public static void main(String[] args) {
        HashSet<Integer> myhashset = new HashSet<>(6,0.5f);
        myhashset.add(6);
        myhashset.add(5);
        myhashset.add(7);
        myhashset.add(11);
        myhashset.add(11);
        System.out.println(myhashset);
    }
}
