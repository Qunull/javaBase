package 万年历;


import java.util.Calendar;
import java.util.Scanner;

public class 日历 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        int days = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (year%4 == 0&&year%100!=0 || year%400==0){
                    days = 29;
                }else {
                    days = 28;
                }
                break;
            default:
                days = 30;
                break;
        }
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,1);
        int weekDay = cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int j = 1; j <= weekDay; j++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= days; i++) {
            cal.set(year,month-1,i);
            System.out.print(i+"\t");
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                System.out.println();
            }
        }
    }
}
