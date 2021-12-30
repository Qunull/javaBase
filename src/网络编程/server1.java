package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {
    public static void main(String[] args) {
        try {
            //1.服务器Socket字节 网络编程节点——————socket
            ServerSocket serverSocket = new ServerSocket(10101);
            //2.启动监听模式
            Socket socket = serverSocket.accept();
            //3.获取 输入流
            InputStream is = socket.getInputStream();
            //4.从输入流中 读取信息
            BufferedReader br = new BufferedReader(new InputStreamReader(is,"GBK"));
            //5.循环读取
            String word = null;
            while ((word = br.readLine())!=null){
                System.out.println(word);
            }
            //6.关闭相关的流
            is.close();
            br.close();
            //socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
