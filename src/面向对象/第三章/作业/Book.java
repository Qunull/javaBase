package 面向对象.第三章.作业;

import java.util.Scanner;

public class Book {
    private String title;
    private int pageNum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum > 200) {
            this.pageNum = pageNum;
        }else {
            System.out.println("输入错误，页数大于200");
            this.pageNum = 200;
        }
    }

    public Book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }
    public void detail(){
        System.out.println("书名：《"+title+"》，页数："+pageNum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = input.next();
        System.out.println("请输入页数：");
        int num = input.nextInt();
        Book book = new Book(name,num);
        book.setTitle(name);
        book.setPageNum(num);
        book.detail();
    }
}
