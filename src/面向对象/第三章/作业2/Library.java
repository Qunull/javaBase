package 面向对象.第三章.作业2;

public class Library {
    private String name;
    private String author;
    private String press;
    private double price;

    public void inform(){
        System.out.println("书名：《"+getName()+"》 作者："+getAuthor()+" 出版社："+getPress()+" 价格："+getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 10) {
            this.price = price;
        }else {
            this.price = 10;
        }
    }
}
