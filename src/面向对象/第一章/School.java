package 面向对象.第一章;
/**
 * class 是java中最小的组织单元
 * calss是自定义的 数据类型
 */

public class School {
        //成员变量---属性  数据类型 名称；
    String name ;//学校名称
    String address;//学校地址
    int roomNum;//教室个数
    int teacherNum;//教员人数

    //成员方法 -- 其中1种
    //void 方法没有返回值  show()名称方法（驼峰命名法）
    public void show(){
        //方法体 -- 具体的执行操作
        System.out.println("学校名称："+name+"，学校地址："+address+"，我们有"+roomNum+"个教室，"+teacherNum+"个教员！！！");
    }
}
