package 拆分;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lx1 {
    public int wordCount(String line, String word) {
        int count = 0;
        List<String> strlist = new ArrayList<>();
        int len = word.length();
        for (int i = 0; i < line.length() - len + 1; i++) {
            strlist.add(line.substring(i, i + len));
        }
        for (String w : strlist) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String a = (input.next());
        System.out.println("请输入要查找的字符：");
        String b = input.next();
        lx1 lx1 = new lx1();
        int count = lx1.wordCount(a, b);
        System.out.println("”" + a + "“中包含" + count + "个" + b);
    }
}
