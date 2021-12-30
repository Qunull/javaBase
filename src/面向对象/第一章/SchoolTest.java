package 面向对象.第一章;

public class SchoolTest {
    public static void main(String[] args) {
    //1.创建 School对象  类名 对象名=new 类名（）
    School school =new School();
    //2.使用对象的属性和方法 通过 对象名。属性/方法（）
    school.name =  "课工场";
    school.address = "文化宫";
    school.roomNum = 4;
    school.teacherNum = 10;
    //执行的是school对象里的show();
        school.show();
    }
}
