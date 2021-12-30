package IO;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        BufferedWriter  bw = null;
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
        InputStreamReader isr = null;
        try {
            fw = new FileWriter("");
            bw = new BufferedWriter(fw);

            InputStream is = new FileInputStream("");
            isr = new InputStreamReader(is,"UTF-8");
            br = new BufferedReader(isr);
            String line = null;
            while((line = br.readLine())!=null){
                System.out.println(line);
                bw.write(line+"\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
