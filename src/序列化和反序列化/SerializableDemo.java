package 序列化和反序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
    public static void main(String[] args) {
        Student stu = new Student("张三",18);
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("file/stu.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(stu);
            oos.flush();
            System.out.println("序列化完毕。。。");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
