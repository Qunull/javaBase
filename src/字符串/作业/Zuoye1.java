package 字符串.作业;

import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个邮箱账号：");
        StringBuffer stringBuffer = new StringBuffer(input.next());
        int a = stringBuffer.indexOf("@");
        if (a != -1){
            int b = stringBuffer.lastIndexOf(".com");
            if (b != -1 && stringBuffer.substring(stringBuffer.length()-4).equals(".com")){
                System.out.println("邮箱格式输入正确！");
            }
            else {
                System.out.println("缺少.com");
            }
        }else {
            System.out.println("邮箱格式缺少@");
        }
    }
}
