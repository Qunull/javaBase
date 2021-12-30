package 数组作业.作业;

public class Zuoye1 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int max = 0;
        int min = 100;
        int count = 0;
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random()*41+10);
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
            count += a[i];
        }
        for (int b : a){
            System.out.println(b);
        }
        System.out.println("最大数："+max);
        System.out.println("最小数："+min);
        System.out.println("平均数："+count/20);
        System.out.println("总数："+count);
    }
}
