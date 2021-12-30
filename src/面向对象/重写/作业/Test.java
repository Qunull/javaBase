package 面向对象.重写.作业;

public class Test {
    public static void main(String[] args) {
        Person1 a = new Person1();
        System.out.println("此人基本信息如下：");
        a.setName("公安局警官");
        a.setAddress("上海市长宁路");
        a.setNumb(110);
        a.setEmile("110@126.com");
        System.out.println(a.toString());
        Student1 b = new Student1();
        b.setName("链条哥");
        b.setAddress("上海市浦东新区海科路");
        b.setNumb(1397799887);
        b.setEmile("liantiao@126.com");
        b.setClassroom("大一");
        System.out.println(b.toString());
        System.out.println();
        Employee1 c = new Employee1();
        c.setName("浩哥");
        c.setAddress("上海市浦东新区99号");
        c.setNumb(1394453334);
        c.setEmile("123@126.com");
        c.setRoom("小卫星502室");
        c.setMoney(8000);
        c.setDate("2014.12.30");
        System.out.println(c.toString());
        System.out.println();
        Staff d = new Staff();
        d.setName("老三");
        d.setAddress("上海市浦东新区100号");
        d.setNumb(1338765456);
        d.setEmile("123567@126.com");
        d.setMoney(8000);
        d.setDate("2014.12.30");
        d.setTime("周一到周五上午9点到下午5点");
        d.setTitle("导航室工程师");
        System.out.println(d.toString());
    }
}
