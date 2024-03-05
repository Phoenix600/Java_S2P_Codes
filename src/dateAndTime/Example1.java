package dateAndTime;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        // Returns the number of milliseconds passed from 1st Jan 1970 to till current time
        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);

        Date date = new Date();
        System.out.println(date);
        Date d = new Date("12/12/1002");
        System.out.println(d);

        System.out.println( "Date Object date is greater than d date object : "+ date.compareTo(d));

    }
}
