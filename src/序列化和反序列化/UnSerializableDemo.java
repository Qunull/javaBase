package 序列化和反序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializableDemo {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        Student stu = null;
        try {
            fis = new FileInputStream("file/stu.txt");
            ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            if (ob instanceof Student){
                stu = (Student) ob;
            }
            System.out.println("反序列化完毕。。。");
            System.out.println("name:"+stu.getName()+",age:"+stu.getAge());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
