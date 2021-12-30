package 接口.防盗门;

public class TheftDoor extends Door implements Lock{

    @Override
    public void openDoor() {
        System.out.println("门打开了");
    }

    @Override
    public void closeDoor() {
        System.out.println("门关上了");
    }

    @Override
    public void openLock() {
        System.out.println("开锁");
    }

    @Override
    public void closeLock() {
        System.out.println("上锁");
    }
}
