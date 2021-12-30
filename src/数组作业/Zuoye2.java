package 数组作业;

public class Zuoye2 {
    public static void main(String[] args) {
        int a[][] = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b += a[i][j];
            }
        }
        System.out.println(b);
    }
}
