package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务器端
public class Server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BufferedReader br = null;
        InputStream is = null;
        Socket socket = null;

        OutputStream os = null;
        BufferedWriter bw = null;
        //1. 创建 服务器的socket端点
        try {//服务的端口是9090
            ServerSocket server = new ServerSocket(9090);
            // 2.对规定的9090端口 进行监听
            socket = server.accept();
            // 3.打开 socket相关的输入流
            is = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line= br.readLine())!=null){
                System.out.println("客户端说: "+ line);
            }
            //

            //再利用 socket的输出流 进行数据的返回
            os = socket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(os));
            System.out.print("请输入:");
            String answer = in.nextLine();
            bw.write(answer);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                br.close();
                is.close();
                bw.close();
                os.close();
                //socket的开关 决定了 accept是否继续监听
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
