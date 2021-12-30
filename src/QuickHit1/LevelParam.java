package QuickHit1;


public class LevelParam {
    public final static Level levels[] = new Level[6];
    static {
        levels[0] = new Level(1,5,2,30,1);
        levels[1] = new Level(2,10,1,30,2);
        levels[2] = new Level(3,15,1,30,2);
        levels[3] = new Level(4,20,1,30,2);
        levels[4] = new Level(5,25,1,30,5);
        levels[5] = new Level(6,90,1,30,100);
    }
}
