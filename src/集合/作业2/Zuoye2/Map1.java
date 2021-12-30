package 集合.作业2.Zuoye2;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");
        map.put("Allen", "JDBC");
        if (map.containsKey("Lucy")) {
            map.put("Lucy", "CoreJava");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }
        System.out.println();
        for (String c : map.keySet()) {
            if (map.get(c).equals("JSP")) {
                System.out.println(c);
            }
        }
    }
}
