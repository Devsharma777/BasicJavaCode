package dev_sharma777;

import java.util.Calendar;
import java.util.TimeZone;

public class dev_60_gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " : " + c.get(Calendar.MINUTE)+ " : " + c.get(Calendar.SECOND));
        System.out.println(TimeZone.getAvailableIDs(0));
        System.out.println(TimeZone.getAvailableIDs(1));
        System.out.println(TimeZone.getAvailableIDs(2));

    }
}
