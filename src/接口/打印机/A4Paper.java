package 接口.打印机;

public class A4Paper implements Paper{
    @Override
    public String getSize() {
        return "A4";
    }
}
