package 面向对象.第三章;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到宠物店");
        System.out.print("请输入要领养的宠物名字：");
        String name = input.next();
        System.out.print("请选择要领养的宠物类型(1.狗狗  2.企鹅)：");
        int type = input.nextInt();
        switch (type){
            case 1:
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("请选择狗狗的品种1.泰迪 2.哈士奇:");
                int brand = input.nextInt();
                if (brand == 1){
                    dog.setbrand("泰迪");
                }else {
                    dog.setbrand("哈士奇");
                }
                System.out.print("请输入狗狗的健康值0—100：");
                dog.setHealth(input.nextInt());
                dog.info();
                break;
            case 2:
                Penguin penguin = new Penguin();
                penguin.setName(name);
                System.out.print("请选择企鹅的性别 1.Q仔 2.Q妹：");
                int sex = input.nextInt();
                if (sex == 1){
                    penguin.setGender("Q仔");
                }else {
                    penguin.setGender("Q妹");
                }
                System.out.print("请输入企鹅的健康值0—100：");
                penguin.setHealth(input.nextInt());
                penguin.info();
                break;
        }
    }
}
