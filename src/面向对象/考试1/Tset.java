package 面向对象.考试1;

import java.util.Scanner;

public class Tset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Region.init();
        System.out.println("欢迎来到购房中心");
        Region.showRegions();
        System.out.println();
        String rName = input.next();
        int rNo = Region.getRegionNo(rName);
        House.init();
        House house = new House();
        house.showHouse(rNo);

    }
}
