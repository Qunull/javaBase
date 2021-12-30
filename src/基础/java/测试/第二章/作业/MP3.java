package 基础.java.测试.第二章.作业;

import java.util.Scanner;

public class MP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("品牌（brand）:");
        String a = input.nextLine();
        if ( a.trim().equals("") ){
            System.out.println("爱国者F928");
        }
        System.out.print("重量（weight）:");
        String b = input.nextLine();
        if (b.trim().equals("" )){
            System.out.println("12.4");
        }
        System.out.print("电池类型（type）:");
        String c = input.nextLine();
        if (c.trim().equals("")){
            System.out.println("内置锂电池");
        }
        System.out.print("价格（price）:");
        String d = input.nextLine();
        if (d.trim().equals("")){
            System.out.println("499");
        }

    }
}
