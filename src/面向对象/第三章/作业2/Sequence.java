package 面向对象.第三章.作业2;

import java.util.Scanner;

public class Sequence {
    private int fn = 1;
    private int fn1 = 4;

   public int rec(int n){
       int result = 0;
       if(n == 0){
           return fn;
       }
       if (n == 1){
           return fn1;
       }
       if (n >= 2){
           for (int i = 2;i <= n;i++){
               result = 2*fn1+fn;
               fn = fn1;
               fn1 = result;
           }
       }
       return result;
   }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Sequence sequence = new Sequence();
        System.out.println("输入值：");
        System.out.println(sequence.rec(input.nextInt()));
    }
}
