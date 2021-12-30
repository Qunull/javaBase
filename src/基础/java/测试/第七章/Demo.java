package 基础.java.测试.第七章;

public class Demo {
    public static void main(String[] args) {
        //二重数组
        int[][] a = new int[2][2];
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        //int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
                //sum += 1;
                /*if (sum == 2){
                    System.out.println();
                */}
            System.out.println();
            }
    }
}
