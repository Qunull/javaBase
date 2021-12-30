package 面向对象.学生管理系统;

public class Mark {
    private int stuNo;
    private double writeScore;
    private double labScore;

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public double getWriteScore() {
        return writeScore;
    }

    public void setWriteScore(double writeScore) {
        this.writeScore = writeScore;
    }

    public double getLabScore() {
        return labScore;
    }

    public void setLabScore(double labScore) {
        this.labScore = labScore;
    }

    public Mark() {
    }
    public Mark(int stuNo,double writeScore,double labScore){
        this.stuNo = stuNo;
        this.writeScore = writeScore;
        this.labScore = labScore;
    }

    static Mark[] marks = new Mark[20];
    static public void init(){
        marks[0] = new Mark(1001,50,66);
        marks[1] = new Mark(1002,65,46);
        marks[2] = new Mark(1003,45,56);
        marks[3] = new Mark(1004,87,34);
        marks[4] = new Mark(1005,9,88);
        marks[5] = new Mark(1006,78,78);
        marks[6] = new Mark(1007,99,46);
        marks[7] = new Mark(1008,78,56);
        marks[8] = new Mark(1009,54,31);
        marks[9] = new Mark(1010,65,76);
    }
    public String getMarkByNo(int stuNo){
        String result = "";
        for (Mark mark : marks){
            if (mark != null && mark.getStuNo() == stuNo){
                result = "笔试成绩："+mark.getWriteScore()+"\t机试成绩："+mark.labScore;
            }
        }
        return result;
    }
    public int[] noPassStuNo(double written,double lab){
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != null && (marks[i].getWriteScore() < written || marks[i].getLabScore() < lab)){
                count++;
            }
        }
        int[] stuNos = new int[count];
        int j = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != null && (marks[i].getWriteScore() < written || marks[i].getLabScore() < lab)){
                stuNos[j] = marks[i].getStuNo();
                j++;
            }
        }
        return stuNos;
    }
}
