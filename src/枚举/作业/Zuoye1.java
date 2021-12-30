package 枚举.作业;

import java.util.*;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.print("请输入一个邮箱账号：");
        String email = input.next();
        int email1 = email.indexOf("@");
        if (email1 != -1){
            System.out.println("@符号在第"+email1+"位");
        }else {
            System.out.println("没有找到@符号");
        }*/
        /*System.out.print("请输入要拼接的字符串一：");
        String string1 = input.next();
        System.out.print("请输入要拼接的字符串二：");
        String string2 = input.next();
        System.out.println("拼接的字符串：");
        String string3 = string1+string2;
        System.out.println(string3);*/
        /*System.out.print("输入要比较的字符串一：");
        String string4 = input.next();
        System.out.print("输入要比较的字符串二：");
        String string5 = input.next();
        if (string4.equals(string5)){
            System.out.println("字符串相等！");
        }else {
            System.out.println("字符串不相等！");
        }*/
        /*System.out.print("请输入一段字符串：");
        String a = input.next();
        if (a.length() > 10){
            System.out.println("第三位置是："+a.charAt(3));
            System.out.println("第五位置是："+a.substring(5,6));
            System.out.println("第七位置是："+a.substring(7,8));
            System.out.println("第九位置是："+a.substring(9,10));
        }else {
            System.out.println("请输入长度大于十的字符串");
        }*/
        /*String a = "我是中国人，我爱中国，在中国非常的幸福";
        System.out.println(a);
        System.out.println("第一个中国的位置："+a.indexOf("中国"));
        System.out.println("第最后一个中国的位置："+a.lastIndexOf("中国"));*/
        /*String a = "this is Java , that is c++";
        System.out.println(a);
        System.out.println(a.replaceAll("is","at"));
        System.out.println(a.replaceAll("at","is"));*/
        /*String a = "this is a test of java";
        System.out.println(a);
        System.out.println(a.indexOf("test"));
        System.out.println(a.substring(a.indexOf("test")));*/
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("赵一");
        list.add("钱二");
        list.add("孙三");
        String b ;
        int a = list.size();
        for (int i = 0; i < a; i++) {
            b = list.get(random.nextInt(list.size()));
            System.out.println("第"+(i+1)+"位同学："+b);
            list.remove(b);
        }
    }
}
