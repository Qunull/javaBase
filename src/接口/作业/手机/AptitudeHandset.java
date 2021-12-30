package 接口.作业.手机;

public class AptitudeHandset extends Handset implements TheakePictures,Network{
    @Override
    public void sendInfo() {
        System.out.println("这是一款型号为HTC的I9100的手机：");
    }

    @Override
    public void call() {
        System.out.println("开始视频通话。。。");
    }

    @Override
    public void info() {
        System.out.println("发送带图片与文字的信息。。。");
    }

    @Override
    public void networkConn() {
        System.out.println("已经启动移动网络。。。");
    }

    @Override
    public void takePictures() {
        System.out.println("开始播放视频《小时代》。。。");
    }
    public void picture(){
        System.out.println("咔嚓。。。拍照成功");
    }
}
