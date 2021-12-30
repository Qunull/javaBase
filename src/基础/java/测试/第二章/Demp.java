package 基础.java.测试.第二章;
import java.util.*;//导入工具包
public class Demp {
    public static void main(String[] args) {
        //键盘输入
        //导入工具包
        //创建工具（扫描仪）
        //使用键盘输入（使用之前加提示语句）
        Scanner input = new Scanner(System.in);//创建工具包
        System.out.println("请输入一个数字：");
        int a = input.nextInt();
        System.out.println("您输入的数字是："+a);


        System.out.println("请输入一个小数：");
        double b = input.nextDouble();
        System.out.println("您输入的小数是："+b);

        System.out.println("请输入一个字符串：");
        String c = input.next();
        System.out.println("您输入的字符串是："+c);
    }

}
