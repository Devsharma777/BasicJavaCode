package dev_sharma777;

import java.util.Calendar;
import java.util.TimeZone;

public class dev_59_calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("ASIA/singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
