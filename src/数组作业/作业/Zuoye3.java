package 数组作业.作业;

public class Zuoye3 {
    public static void main(String[] args) {
        int[] a = {5,-9,32,77,64,-24,14,0,21,45};
        int max = 0;
        int min = 100;
        int c = 0;
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]){
                c = i;
            }
            if (min == a[i]){
                d = i;
            }
        }
        System.out.println("最大值位置："+c);
        System.out.println("最小值位置："+d);
    }
}
