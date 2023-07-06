package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 9:29
 * @version: 1.0
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
//创建ServerSocket对象
        ServerSocket ss = new ServerSocket(1000);
        //获取监听事件
        Socket accept = ss.accept();
        //创建输入流对象并读取数据
            //转换为字符流输出数据
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //给客户端发送信息
        OutputStream os = accept.getOutputStream();
        os.write("我是服务器端".getBytes(StandardCharsets.UTF_8));
        //释放资源
        os.close();
        br.close();
        accept.close();
        ss.close();
    }
}
