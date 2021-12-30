package QuickHit;

public class LevelParam {
    public final static Level levels[] = new Level[6];
    static {
        levels[0] = new Level(1,1,5,30,1);
        levels[1] = new Level(2,2,4,30,2);
        levels[2] = new Level(3,3,3,30,2);
        levels[3] = new Level(4,5,3,30,2);
        levels[4] = new Level(5,10,1,30,5);
        levels[5] = new Level(6,15,1,30,100);
    }
}
