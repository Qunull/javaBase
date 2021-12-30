package 异常;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.println("请输入课程代号（1~3之间的额数字）：");
        try {
            a = input.nextInt();
            switch (a){
                case 1:
                    System.out.println("java");
                    break;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("C++");
                    break;
                default:
                    System.err.println("输入错误");
                    break;
            }
        }catch (Exception e){
            System.err.println("输入错误");
        }finally {
            System.out.println("欢迎提出建议");
        }

    }
}
