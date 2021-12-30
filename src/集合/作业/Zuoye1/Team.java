package 集合.作业.Zuoye1;

import java.util.LinkedList;
import java.util.Random;

public class Team {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("科特迪瓦");
        list.add("阿根廷");
        list.add("澳大利亚");
        list.add("塞尔维亚");
        list.add("荷兰");
        list.add("尼日利亚");
        list.add("日本");
        list.add("美国");
        list.add("中国");
        list.add("新西兰");
        list.add("巴西");
        list.add("比利时");
        list.add("韩国");
        list.add("喀麦隆");
        list.add("洪都拉斯");
        list.add("意大利");
        Random random = new Random();
        String b;
        for (int i = 1; i <= 4; i++) {
            System.out.println(i+"组");
            for (int j = 0; j < 4; j++) {
                b = list.get(random.nextInt(list.size()));
                System.out.print(b + "\t");
                list.remove(b);
            }
            System.out.println("\n");
        }
    }
}
