package 集合.排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(5);
        list.add(678);
        list.add(978);
        list.add(555);
        Collections.sort(list);
        for (int n : list){
            System.out.println(n);
        }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println("--------------");
        Person p1 = new Person("张三",22,"男");
        Person p2 = new Person("李四",24,"女");
        Person p3 = new Person("王五",26,"男");
        Person p4 = new Person("赵六",299,"男");
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        Collections.sort(personList);
        for (Person p : personList){
            System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getGander());
        }
    }
}
