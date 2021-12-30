package UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DatagramSocket socket = null;
        byte[] b = new byte[10240000]; //用于接收数据的数组
        DatagramPacket packet = new DatagramPacket(b,b.length);
        while(true){
            try {
                // socket管理9000端口
                socket = new DatagramSocket(9000);
                //接收数据 receive接收
                socket.receive(packet);
                //从包中 获取数据
                String content = "";
                byte[] newBytes=packet.getData();
                content = new String(newBytes,0,newBytes.length);
                System.out.println("客户端说:"+content);
                //回应
                System.out.print("我说:");
                String answer = in.nextLine();
                //指定IP地址
                DatagramPacket packet2 = new DatagramPacket(answer.getBytes(),0,answer.getBytes().length,packet.getSocketAddress());
                //send 发送  数据包
                socket.send(packet2);
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(socket!=null)
                    socket.close();
            }
        }

    }
}
