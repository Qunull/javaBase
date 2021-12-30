package QuickHit;

import java.util.Scanner;

public class Player {
    private int levelNo = 1;//玩家当前级别号
    private int curScore = 0;//玩家当前的积分
    private long startTime;//当前级别开始时间
    private int elapsedTime;//当前级别已用时间
    Scanner input = new Scanner(System.in);
    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public void play(){

    }

    public Player(int levelNo, int curScore, long startTime, int elapsedTime) {
        this.levelNo = levelNo;
        this.curScore = curScore;
        this.startTime = startTime;
        this.elapsedTime = elapsedTime;
    }

    public Player() {
        for (int i = 0; i < 6; i++) {

            Game game = new Game(this);
            for (int j = 0; j < LevelParam.levels[getLevelNo()-1].getStrTimes(); j++) {
                setStartTime(System.currentTimeMillis());
                System.out.println("当前等级："+ LevelParam.levels[getLevelNo()-1].getLevelNo());
                String out = game.printStr();
                System.out.println(out);
                String in = input.next();
                game.printResult(out,in);
            }
            setLevelNo(getLevelNo() + 1);
        }

    }


}
