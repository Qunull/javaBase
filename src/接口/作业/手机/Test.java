package 接口.作业.手机;

public class Test {
    public static void main(String[] args) {
        CommonHandset commonHandset = new CommonHandset();
        AptitudeHandset aptitudeHandset = new AptitudeHandset();
        commonHandset.sendInfo();
        commonHandset.play();
        commonHandset.info();
        commonHandset.call();
        System.out.println();
        aptitudeHandset.sendInfo();
        aptitudeHandset.networkConn();
        aptitudeHandset.takePictures();
        aptitudeHandset.picture();
        aptitudeHandset.info();
        aptitudeHandset.call();
    }
}
