package 集合.新闻;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
       /* News n1 = new News(1,"货拉拉","xd");
        News n2 = new News(1,"er","xdds");
        News n3 = new News(1,"san","ds");
        News n4 = new News(1,"si","saa");
        ArrayList<News> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        System.out.println("新闻数量"+list.size());
        for (int i = 0; i < list.size(); i++) {
            News news = list.get(i);
            System.out.println("第"+(i+1)+"新闻的标题是"+news.getTitle());
        }*/
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        for (int i = 1; i < 5; i++) {
            System.out.print("新闻编号：");
            int a = input.nextInt();
            System.out.print("新闻标题：");
            String b = input.next();
            System.out.print("新闻内容：");
            String c = input.next();
            News news = new News(a,b,c);
            list.add(news);
        }
        for (int i = 0; i < list.size(); i++) {
            News news = (News) list.get(i);
            System.out.println("第"+(i+1)+"新闻的标题是"+news.getTitle());
        }

    }
}
