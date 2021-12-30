package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));

        FileReader fr = null;
        try {
            fr = new FileReader("");
            int len = -1;
            while ((len = fr.read())!=-1){
                System.out.print((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
