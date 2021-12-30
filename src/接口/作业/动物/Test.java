package 接口.作业.动物;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Store store = new Store();
        System.out.println("请输入查找的动物：");
        String a = input.next();
        store.get(a).shout();

    }
}
