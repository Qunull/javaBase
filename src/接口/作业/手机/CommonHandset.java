package 接口.作业.手机;

public class CommonHandset extends Handset implements PlayWiring{
    @Override
    public void sendInfo() {
        System.out.println("这是一款型号为G502c的索尼爱立信手机：");
    }

    @Override
    public void call() {
        System.out.println("开始语音通话。。。");
    }

    @Override
    public void info() {
        System.out.println("发送文字消息。。。");
    }

    @Override
    public void play() {
        System.out.println("开始播放音乐《热雪》。。。");
    }
}
