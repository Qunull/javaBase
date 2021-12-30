package 时间;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Text {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dayStr = sdf.format(today);
        System.out.println(dayStr);
    }
}
