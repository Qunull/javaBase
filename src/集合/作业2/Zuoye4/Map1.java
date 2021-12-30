package 集合.作业2.Zuoye4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public List<String> getKeyByValue(Map<String,String> map,String val){
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,String> entry : map.entrySet()){
            if (entry.getValue().equals(val)){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Map1 map1 = new Map1();
        Map<String,String> map = new HashMap<>();
        map.put("aaaa","1111");
        map.put("bbbb","1111");
        map.put("cccc","1111");
        map.put("dddd","1111");
        map.put("eeee","1111");
        map.put("ffff","1111");
        List<String> list = map1.getKeyByValue(map,"1111");
        for (String str : list){
            System.out.println(str+"\t");
        }
    }
}
