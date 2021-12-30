package 网络编程;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Socket socket = null;
        OutputStream os = null;
        BufferedWriter bw = null;

        BufferedReader br = null;
        InputStream is = null;
        //1. 创建Socket连接 --- 连接服务器
        try {
            socket = new Socket("localhost",9090);
            //2. 打开相关的输出流
            os = socket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(os));
            System.out.print("请输入:");
            String word = in.nextLine();
            bw.write(word);
            bw.flush();
            //结束掉输出流
            socket.shutdownOutput();
            //输入流 读取服务器信息
            is = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line= br.readLine())!=null){
                System.out.println("服务器说: "+ line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                os.close();
                br.close();
                is.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
