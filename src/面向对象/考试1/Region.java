package 面向对象.考试1;

public class Region {
    private int rNo;
    private String rName;

    static Region[] regions = new Region[5];

    public Region(int rNo, String rName) {
        this.rNo = rNo;
        this.rName = rName;
    }

    public Region() {
    }

    public static void init() {
        regions[0] = new Region(1, "芝罘区");
        regions[1] = new Region(2, "莱山区");
        regions[2] = new Region(3, "开发区");
        regions[3] = new Region(4, "高新区");
        regions[4] = new Region(5, "福山区");
    }

    public static void showRegions() {
        for (Region r : regions){
            System.out.print(r.getrNo()+","+r.getrName());
        }
    }
    public static int getRegionNo(String rName){
        int rNo = -1;
        for (Region r :regions){
            if(r.getrName().equals(rName)){
                rNo = r.getrNo();
                break;
            }
        }
        return rNo;
    }

   public int getrNo(){
        return rNo;
   }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getrName() { return rName; }

    public void setrName(String rName) {
        this.rName = rName;
    }

}
