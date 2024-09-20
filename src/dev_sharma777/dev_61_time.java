package dev_sharma777;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dev_61_time {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//
//        LocalTime t = LocalTime.now();
//        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter of = DateTimeFormatter.ofPattern("dd/mm/yyyy --E a");
      //  DateTimeFormatter of2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate = dt.format(of);
        System.out.println(mydate);

    }
}
