package 集合.作业.Zuoye3;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Learn");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get((list.size()-1)-i));
        }
    }
}
