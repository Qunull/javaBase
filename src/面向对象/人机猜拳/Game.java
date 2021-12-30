package 面向对象.人机猜拳;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Computer computer = new Computer();
        int tital = 0;
        System.out.println("*********************欢迎进入游戏世界*********************");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t**********************");
        System.out.println("\t\t\t\t**    猜拳 : 开始    **");
        System.out.println("\t\t\t\t**********************");
        System.out.println();
        System.out.println();
        System.out.println("出拳规则：1.剪刀  2.石头  3. 布");
        System.out.print("请输入您的姓名：");
        admin.setName(input.next());
        System.out.println("请选择对手角色：1.鲁肃 2.徐庶 3.荀彧");
        int a = input.nextInt();
        switch (a){
            case 1:
                computer.setName("鲁肃");
                System.out.println(admin.getName()+"选择了"+computer.getName()+"对战");
                break;
            case 2:
                computer.setName("徐庶");
                System.out.println(admin.getName()+"选择了"+computer.getName()+"对战");
                break;
            case 3:
                computer.setName("荀彧");
                System.out.println(admin.getName()+"选择了"+computer.getName()+"对战");
                break;
            default:
                System.out.println("进入隐藏对战！");
                computer.setName("司马懿");
                System.out.println(admin.getName()+"选择了"+computer.getName()+"对战");
                break;
        }
        System.out.println("要开始么？(y/n)");
        String y = input.next();
        while (y.equals("y")){
            System.out.println("请出拳：1.剪刀  2.石头  3.布");
            int a1 = input.nextInt();
            int q = admin.punch(a1);
            int e = computer.punch();
            if (q == e){
                System.out.println(admin.getName()+"和"+computer.getName()+"棋逢对手！！！");
            }else if (q == 1 && e == 2 || q == 2 && e == 3 || q == 3 && e == 1){
                System.out.println(computer.getName()+"获胜！,再试一次吧！");
                computer.setScores(1);
            }else if (q == 1 && e == 3 || q == 2 && e == 1 || q == 3 && e == 2){
                System.out.println("恭喜"+admin.getName()+"获得胜利！！！");
                admin.setScores(1);
            }
            tital ++;
            System.out.println("是否继续？(y/n)");
            String n = input.next();
            if (n.equals("n")){
                break;
            }
        }
        System.out.println(computer.getName()+"  VS  "+admin.getName());
        System.out.println("对战局数："+tital);
        System.out.println("姓名\t\t\t得分(平均不得分)");
        System.out.println(admin.getName()+"\t\t"+admin.getScores());
        System.out.println(computer.getName()+"\t\t\t"+computer.getScores());
        System.out.println();
        if (admin.getScores() > computer.getScores()){
            System.out.println("恭喜"+admin.getName()+"获得最终的游戏胜利！！！");
        }else if (admin.getScores() < computer.getScores()){
            System.out.println(computer.getName()+"获得了最终的胜利！！！");
        }else if (admin.getScores() == computer.getScores()){
            System.out.println(admin.getName()+"和"+computer.getName()+"棋逢对手！！！");
        }

    }
}
