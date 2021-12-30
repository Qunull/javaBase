package 接口.打印机;

public class GrayInkBox implements InkBox{
    @Override
    public String getColor() {
        return "黑白";
    }
}
