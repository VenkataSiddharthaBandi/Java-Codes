// Program to demonstrate Calender in java

import java.util.*;

public class CalenderEx {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getCalendarType());
    }
}
