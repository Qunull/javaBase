package 接口.防盗门;

public class Text {
    public static void main(String[] args) {
        TheftDoor theftDoor = new TheftDoor();
        theftDoor.openLock();
        theftDoor.openDoor();
        theftDoor.closeDoor();
        theftDoor.closeLock();
    }
}
