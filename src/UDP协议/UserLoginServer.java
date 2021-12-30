package UDP协议;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UserLoginServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(9090);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){
            // 2.对规定的9090端口 进行监听
            try {
                socket = server.accept();
                //开启线程
                UserLoginThread loginThread = new UserLoginThread(socket);
                //loginThread.setName();
                loginThread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
