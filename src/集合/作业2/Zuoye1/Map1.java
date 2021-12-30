package 集合.作业2.Zuoye1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map1 {
    private String term;
    private String place;
    private String champion;

    public Map1() {
    }

    public Map1(String term, String place, String champion) {
        this.term = term;
        this.place = place;
        this.champion = champion;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer,Map1> map = new HashMap<>();
        map.put(1930,new Map1("第一届","乌拉圭","乌拉圭"));
        map.put(1934,new Map1("第二届","意大利","意大利"));
        map.put(1938,new Map1("第三届","法国","意大利"));
        map.put(1950,new Map1("第四届","巴西","乌拉圭"));
        map.put(1954,new Map1("第五届","瑞士","西德"));
        map.put(1958,new Map1("第六届","瑞典","巴西"));
        map.put(1962,new Map1("第七届","智利","巴西"));
        map.put(1966,new Map1("第八届","英格兰","英格兰"));
        map.put(1970,new Map1("第九届","墨西哥","巴西"));
        map.put(1974,new Map1("第十届","前西德","西德"));
        map.put(1978,new Map1("第十一届","阿根廷","阿根廷"));
        map.put(1982,new Map1("第十二届","西班牙","意大利"));
        map.put(1986,new Map1("第十三届","墨西哥","阿根廷"));
        map.put(1990,new Map1("第十四届","意大利","西德"));
        map.put(1994,new Map1("第十五届","美国","巴西"));
        map.put(1998,new Map1("第十六届","法国","法国"));
        map.put(2002,new Map1("第十七届","韩日","巴西"));
        map.put(2006,new Map1("第十八届","德国","意大利"));
        map.put(2010,new Map1("第十九届","南非","西班牙"));
        map.put(2014,new Map1("第二十届","巴西","德国"));
        System.out.print("请输入你要查询的年份：");
        int a = input.nextInt();
        if (map.get(a) != null){
            System.out.println(map.get(a).getTerm()+",地点:"+map.get(a).getPlace()+"，冠军："+map.get(a).getChampion());
        }else {
            System.out.println("改年份没有举办世界杯！");
        }
        System.out.print("输入你要查询的球队：");
        String b = input.next();
        Set<Integer> ketSet = map.keySet();
        for (int key : ketSet){
            if (map.get(key).champion.equals(b)){
                System.out.println(key);
            }
        }
    }
}
