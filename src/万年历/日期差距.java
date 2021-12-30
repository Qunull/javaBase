package 万年历;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class 日期差距 {
    public static void main(String[] args) {
        Calendar date1 = Calendar.getInstance();
        date1.set(2021,9-1,11);
        Calendar date2 = Calendar.getInstance();
        date2.set(2021,8-1,11);

        long time1 = date1.getTimeInMillis();
        long time2 = date2.getTimeInMillis();

        long days = Math.abs(time1-time2)/1000/60/60/24;
        System.out.println("间隔："+days);

        long days2 = ChronoUnit.DAYS.between(date1.getTime().toInstant(),date2.getTime().toInstant());
        System.out.println(Math.abs(days2));
    }
}
