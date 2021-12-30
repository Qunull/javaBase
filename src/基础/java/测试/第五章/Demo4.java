package 基础.java.测试.第五章;

public class Demo4 {
    public static void main(String[] args) {
//        Scanner dwg=new Scanner(System.in);
//        System.out.print("输入高度");
//        int hang=dwg.nextInt();
        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print(" ");
            }
            for (int q = 2 * i - 1; q > 0; q--) {
                if (i == 1) {
                    System.out.print("*");
                } else {
                    if (q == 1 || q == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");

        }
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * (rows - i) - 1; m++) {
                if (i == rows - 1) {
                    System.out.print("*");
                } else if (m == 1 || m == 2 * rows - 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
