package 数组作业;

public class Zuoye1 {
    public static void main(String[] args) {
        int a[] = {3,-9,32,77,63,-24,14,0,21,45};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] < a[j+1]){
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
