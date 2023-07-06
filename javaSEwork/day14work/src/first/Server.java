package first;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 18:21
 * @version: 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(1000);
        //创建accept对象
        Socket accept = ss.accept();
        //创建缓冲输入流从网络上读取数据
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //创建uuid对象随机生成上传照片的名字
        UUID uuid = UUID.randomUUID();
        String name = uuid.toString().replace("-", "");
        //创建缓冲输出流写出数据
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day14work//" + name + ".jpg"));
        //读取并写入数据
        int read;
        while((read=bis.read())!=-1){
            bos.write(read);
        }

        //给客户端发送“上传成功”
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功!");
        bw.newLine();
        bw.flush();

        //释放资源
        bos.close();
        accept.close();
        ss.close();


    }
}
