package 数组作业;

public class Zuoye6 {
    public static void main(String[] args) {
        int[] a = {4,4,34,37,3,12,2,6,5,17,9,11};
        int[][] b = new int[3][4];
        int max = 0;
        int min = 100;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[i*4+j];
                if (a[i*4+j] > max){
                    max = a[i*4+j];
                }
                if (a[i*4+j] < min){
                    min = a[i*4+j];
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
    }
}
