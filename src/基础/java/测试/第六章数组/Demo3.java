package 基础.java.测试.第六章数组;

public class Demo3 {
    public static void main(String[] args) {
        //冒泡排序
        //一堆数字来排队，两两对比小靠前，外层循环n-1,内层循环n-1-i
        //
        int[] arr3 = {2,3,6,1,9};
        //外层控制轮数
        for (int i = 0; i < arr3.length-1; i++) {
            for (int j = 0; j < arr3.length-1-i; j++) {
                if (arr3[j] > arr3[j+1]){
                    //大于 小于 控制从大到小 还是从小到大
                    //交换位置
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
