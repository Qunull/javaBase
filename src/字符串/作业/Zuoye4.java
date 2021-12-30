package 字符串.作业;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date today = new Date();
        System.out.println(today);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(today));
        System.out.print("输入时间14位字符串：");
        StringBuffer stringBuffer = new StringBuffer(input.nextLine());
        if (stringBuffer.length() == 14){
            stringBuffer.insert(4,"-");
            stringBuffer.insert(7,"-");
            stringBuffer.insert(10," ");
            stringBuffer.insert(13,":");
            stringBuffer.insert(16,":");
            System.out.println(stringBuffer.toString());
        }else {
            System.out.println("输入的字符串不符合标准！");
        }
    }
}
