package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        /*File file = new File("src/IO/Demo.java");
        System.out.println(file.exists());//判断文件或者目录是否存在
        System.out.println(file.isFile());//判断是否是文件
        System.out.println(file.isDirectory());//判断是否是目录
        System.out.println(file.getPath());//相对路径
        System.out.println(file.getAbsolutePath());//绝对路径
    System.out.println(file.getName());//名字122
        try {
            file.createNewFile();//创建新文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.length());//文件长度
    }*/
        FileInputStream fis = null;
        {
            try {
                fis = new FileInputStream("E:\\课工场\\HTML\\html5笔记.md");
                int len = 0;
                byte[] b = new byte[1024];
               /* while (((len = fis.read()) != -1)) {
                    System.out.print((char) len);
                }*/
                while ((len = fis.read(b,0,1024))!=-1){
                    for (int i = 0; i < b.length; i++) {
                        System.out.print((char)b[i]);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
