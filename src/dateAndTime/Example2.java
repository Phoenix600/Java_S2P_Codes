package dateAndTime;
import java.util.Date;
public class Example2 {
    public static void main(String[] args) {
        Date date = new Date("12/12/12 19:38:49");
        System.out.println(date);
        System.out.println("Date : " +date.getTime());
        System.out.println("Years Passed From 1970: " + date.getYear()); // Returns the total number of years passed from 1970
        System.out.println("Month Number :" +date.getMonth());
        System.out.println("" + date.getDay()); // Returns Week day number
        System.out.println(""+date.getDate()); // Returns the date only
        System.out.println(""+date.getHours()); // Returns the hours passed
        System.out.println(""+date.getMinutes()); // returns the minutes passed
        System.out.println(""+date.getSeconds()); // returns the seconds passed
        System.out.println("Offset "+date.getTimezoneOffset());


    }
}
