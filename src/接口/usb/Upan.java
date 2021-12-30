package 接口.usb;

public class Upan implements UsbInterface{
    @Override
    public void service() {
        System.out.println("接入U盘，开始读取数据");
    }
}
