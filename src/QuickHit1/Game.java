package QuickHit1;

public class Game {
    public Player player;
    public String printStr(){
        Level level = null;
        for (int i = 0; i < LevelParam.levels.length; i++) {
            if (LevelParam.levels[i].getLevelNo() == player.getLevelNo()){
                level = LevelParam.levels[i];
                break;
            }
        }
        String str = "";
        for (int i = 0; i < level.getStrLength(); i++) {
            int random = (int) (Math.random()*7+1);
            switch (random) {
                case 1:
                    str += "q";
                    break;
                case 2:
                    str += "w";
                    break;
                case 3:
                    str += "e";
                    break;
                case 4:
                    str += "r";
                    break;
                case 5:
                    str += "a";
                    break;
                case 6:
                    str += "s";
                    break;
                case 7:
                    str += "d";
                    break;
                case 8:
                    str += "f";
                    break;
            }
        }
        return str;
    }
    public void printResult(String out,String in){
        if (player.elapsedTime > LevelParam.levels[player.levelNo-1].getTimeLimit()) {
            System.out.println("输入超时，游戏结束！");
            System.exit(1);
        }
        if (out.equals(in)){
            player.curScore += LevelParam.levels[player.levelNo-1].getPerScore();
            System.out.println("输入正确，当前级别："+player.levelNo+"，积分为："+player.curScore+",已用时间："+player.elapsedTime+"秒");
            if (player.curScore >= 100){
                System.out.println("闯关成功！");
            }
        }else  {
            System.out.println("输入错误，游戏结束！");
            System.exit(1);
        }

    }
    public static void main(String[] args) {
        Game game = new Game();
        game.player = new Player();

    }
}
