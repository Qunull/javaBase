package QuickHit1;

import java.util.Scanner;

public class Player {
       public int levelNo = 1;//玩家当前级别号
       public int curScore = 0;//玩家当前的积分
       public long startTime;//当前级别开始时间
       public long elapsedTime;//当前级别已用时间
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

        public long getElapsedTime() {
            return elapsedTime;
        }

        public void setElapsedTime(int elapsedTime) {
            this.elapsedTime = elapsedTime;
        }

        public Player(int levelNo, int curScore, long startTime, int elapsedTime) {
            this.levelNo = levelNo;
            this.curScore = curScore;
            this.startTime = startTime;
            this.elapsedTime = elapsedTime;
        }
        public String play(){
            Scanner input = new Scanner(System.in);
            String inputStr = input.next();
            return inputStr;
        }

    public Player() {
    }
}
