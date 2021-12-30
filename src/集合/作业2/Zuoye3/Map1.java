package 集合.作业2.Zuoye3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("请输入一段字符：");
        String line = input.nextLine();
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            String word = line.substring(i,i+1);
            map.put(word,0);
        }
        for (String key : map.keySet()){
            for (int i = 0; i < line.length(); i++) {
                String word = line.substring(i,i+1);
                if (word.equals(key)){
                    map.put(key,map.get(key)+1);
                    count++;
                }
            }
        }
        System.out.println("字符\t\t次数");
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
        System.out.println("总计:\t"+count);
    }
}
