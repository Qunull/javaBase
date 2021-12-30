package 接口.usb;

public class Test {
    public static void main(String[] args) {
        UsbInterface ui1 = new Upan();
        UsbInterface ui2 = new Fan();
        ui1.service();
        ui2.service();
    }
}
