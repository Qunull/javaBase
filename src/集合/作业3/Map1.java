package 集合.作业3;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("14","李十四");
        map.put("15","王十五");
        map.put("3","张三");
        map.put("4","李四");
        map.put("5","王五");
        map.put("11","刘十一");
        map.put("7","孙七");
        map.put("8","周八");
        map.put("1","刘一");
        map.put("2","陈二");
        map.put("9","吴九");
        map.put("10","郑十");
        map.put("13","张十三");
        map.put("12","陈十二");
        map.put("6","赵六");
        List<Map.Entry<String,String>> entryList = new ArrayList<>();
        for (Map.Entry<String,String> entry : map.entrySet()){
            entryList.add(entry);
        }
        Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                int a = Integer.parseInt(o1.getKey());
                int b = Integer.parseInt(o2.getKey());
                return a-b;
            }
        });
        for (Map.Entry<String,String> entry : entryList){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
