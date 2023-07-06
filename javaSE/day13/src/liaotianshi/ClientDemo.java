package liaotianshi;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年07月25日 15:11
 * @version: 1.0
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        //接收键盘输入的数据
        String next = sc.next();
        //创建数组保存数据
        byte[] bytes = next.getBytes();
        //创建发送端的DatagramSocket
        DatagramSocket socket = new DatagramSocket(1000);
        //端口号
        int ip=10010;
        //发送数据的地址
        InetAddress address = InetAddress.getByName("127.0.0.1");
        //创建发送端的DatagramPacket
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,ip);
        //发送数据
        socket.send(packet);

    }
}
