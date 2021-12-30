package 接口.usb;

public class Fan implements UsbInterface{
    @Override
    public void service() {
        System.out.println("接入风扇，还是吹风");
    }
}
