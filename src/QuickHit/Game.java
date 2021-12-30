package QuickHit;

import java.util.Scanner;

public class Game {

    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    String a = "";
    Scanner input = new Scanner(System.in);
    Level level = new Level();

    public String printStr() {
        String c = null;
        int b;
        for (int i = 0; i < LevelParam.levels[player.getLevelNo() - 1].getStrLength(); i++) {
            b = (int) (Math.random() * 5 + 1);
            switch (b) {
                case 1:
                    c = "w";
                    break;
                case 2:
                    c = "a";
                    break;
                case 3:
                    c = "s";
                    break;
                case 4:
                    c = "d";
                    break;
                case 5:
                    c = "f";
                    break;
            }
            a += c;

        }
        return a;
    }

    public void printResult(String out, String in) {
        long currentTime = System.currentTimeMillis();
        if (((currentTime - player.getStartTime()) / 1000) >= LevelParam.levels[player.getLevelNo() - 1].getStrTimes()) {
            System.out.println("你输入的太慢了，已经超时，退出！");
            System.exit(1);
        } else {
            if (in.equals(out)) {
                System.out.println("输入正确");
                  player.setCurScore(player.getCurScore()+LevelParam.levels[player.getLevelNo()-1].getPerScore());

                System.out.println("积分：" + player.getCurScore() + "时间：" + ((currentTime - player.getStartTime()) / 1000) + "s");
            } else {
                System.out.println("输入错误，挑战失败！");
                System.exit(1);
            }
        }

    }
}