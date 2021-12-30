package 面向对象;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = {5,7,4,2,1};
        getCountByArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"");
        }
    }
    public static void getCountByArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                arr[i] = 0;
            }
        }
    }
}
