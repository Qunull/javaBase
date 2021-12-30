package 接口.打印机;

public class Printer {
    private InkBox inkBox;
    private Paper paper;

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
    public void print(){
        System.out.println("使用了"+inkBox.getColor()+"墨盒，在"+paper.getSize()+"上打印");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setInkBox(new GrayInkBox());
        printer.setPaper(new A4Paper());
        printer.print();
    }
}
