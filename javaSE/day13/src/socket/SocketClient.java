package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 9:16
 * @version: 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket = socket = new Socket("127.0.0.1", 1000);
        //获取io流并输出数据
        OutputStream os = socket.getOutputStream();
        os.write("我是客户端".getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();//仅仅关闭输出流
        //获取服务器端发送的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        ///释放资源
        br.close();
        os.close();
        socket.close();
    }
}
