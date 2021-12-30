package 集合.作业3;

import java.util.*;

public class Lx3 {
    public HashMap<Integer,User> userSort(HashMap<Integer,User> userMap){
        List<Map.Entry<Integer,User>> entryList = new ArrayList<>();
        for (Map.Entry<Integer,User> entry : userMap.entrySet()){
            entryList.add(entry);
        }
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        HashMap<Integer,User> hashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer,User> entry : entryList){
            hashMap.put(entry.getKey(),entry.getValue());
        }
        return hashMap;
    }

    public static void main(String[] args) {
        HashMap<Integer,User> userHashMap = new HashMap<>();
        userHashMap.put(1,new User("张三",14));
        userHashMap.put(2,new User("里斯",345));
        userHashMap.put(3,new User("王五",1654774));
        userHashMap.put(4,new User("赵六",567));

        Lx3 lx3 = new Lx3();
        userHashMap = lx3.userSort(userHashMap);
        for (Map.Entry<Integer,User> entry : userHashMap.entrySet()){
            System.out.println(entry.getValue().getName()+"\t\t"+entry.getValue().getAge());
        }
    }
}
