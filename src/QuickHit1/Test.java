package QuickHit1;

public class Test {
    public static void main(String[] args) {
        System.out.println("游戏开始！");
        Game game = new Game();
        Player player = new Player();
        game.player = player;
        for (int i = 0; i < LevelParam.levels.length; i++) {
            player.curScore = 0;
            player.elapsedTime = 0;
            player.startTime = System.currentTimeMillis();
            for (int j = 0; j < LevelParam.levels[i].getStrTimes(); j++) {
                String out = game.printStr();
                System.out.println(out);
                String in = player.play();
                long currenTime = System.currentTimeMillis();
                player.elapsedTime = (currenTime - player.startTime)/1000;
                game.printResult(out,in);
            }
            player.levelNo++;
        }
    }
}
