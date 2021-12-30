package 基础.java.测试.第六章.作业;

public class Zuoye2 {
    public static void main(String[] args) {
        //棱形
        System.out.println("      *");
        for (int a = 1; a <= 6; a++) {
            for (int b = 1; b <= (6 - a); b++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int b = 1; b <= 5; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int d = 1; d <= ((6 - b) * 2 - 1); d++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("      *");
    }
}


