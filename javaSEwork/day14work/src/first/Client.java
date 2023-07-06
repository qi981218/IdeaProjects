package first;

import java.io.*;
import java.net.Socket;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 18:14
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket = new Socket("127.0.0.1",1000);
        //创建字节缓冲流读取数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://Desktop//21.jpg"));
        //创建字节缓冲流写入数据---将数据上传到网络上
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //开始读取数据并写入
        int read;
        while ((read= bis.read())!=-1){
            bos.write(read);
        }
        //刷新数据（将缓冲区的数据写入网络）
        bos.flush();
        //关闭当前Socket输出流
        socket.shutdownOutput();


        //获取服务器端发送过来的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(br);
        }

        //释放资源
        bis.close();
        socket.close();



    }
}
