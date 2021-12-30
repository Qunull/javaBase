package 字符串.作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一段数：");
        StringBuffer stringBuffer = new StringBuffer(input.nextLine());
        int a = stringBuffer.length();
        for (int i = 0; i < a-1; i++) {
            if (i == 0 ){
                stringBuffer.insert(1,",");
                continue;
            }
            if (i == 1){
                stringBuffer.insert(3,",");
                continue;
            }
            if (i > 1) {
                stringBuffer.insert(i + i+1, ",");
                continue;
            }
        }
        stringBuffer.append("}");
        stringBuffer.insert(0,"{");
        System.out.println(stringBuffer.toString());
    }
}
