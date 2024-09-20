package dev_sharma777;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class dev_62_practice {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>();
        ar.add("student dev");
        ar.add("student pari");
        ar.add("student rahul");
        ar.add("student mannu");
        ar.add("student aditya");
        ar.add("student anshu");
        ar.add("student soumya");
        ar.add("student megha");
        ar.add("student shivam");
        ar.add("student rohit");
        for (Object ob: ar) {
             System.out.println(ob);
        }
        // question5
        HashSet<Integer> ht = new HashSet<>();
        ht.add(5);
        ht.add(66);
        ht.add(27);
        ht.add(15);
        ht.add(27);
        ht.add(9);
        System.out.println(ht);
    // problem2
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // problem3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //problem4
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter of = DateTimeFormatter.ofPattern("h-m-s -- a");
        System.out.println(of);
    }
}
