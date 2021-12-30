package 字符串.作业;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的账户余额：");
        StringBuffer stringBuffer = new StringBuffer(input.nextLine());
        for (int i = stringBuffer.length() - 3; i > 0; i = i -3) {
            stringBuffer.insert(i,",");
        }
        System.out.println(stringBuffer);
    }
}
