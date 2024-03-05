package dateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Example3 {
    public static void main(String[] args) {
//        Calender And TimeZone Class
        Calendar calendar = new GregorianCalendar();
        GregorianCalendar g = (GregorianCalendar) calendar;

        System.out.println(g.isLeapYear(2020));
        System.out.println(g.get(Calendar.DATE));
        System.out.println(g.get(Calendar.DAY_OF_WEEK));
        System.out.println(g.get(Calendar.DAY_OF_YEAR));


        TimeZone t = g.getTimeZone();
        System.out.println(t.getDisplayName());


    }
}
