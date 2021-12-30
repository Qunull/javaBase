package 基础.java.测试.第六章.作业1;

public class Zuoye1 {
    public static void main(String[] args) {
        int b = 1;
        for (int a = 1; a <= 100; a++) {
            if (a % 7 == 0) {
                continue;
            }
            System.out.print(a + "\t");
            b++;
            if (b % 4 == 0) {
                System.out.println();
            }
        }
    }
}
