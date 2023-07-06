import java.io.*;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 18:25
 * @version: 1.0
 */
public class Encryption {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件地址:");
        String next = sc.next();
        //获取该文件
        File file = new File(next);
        //获取该文件所在的文件夹
        String parent = file.getParent();
        //获取该文件的名字和后缀名
        String name = file.getName();
        //创建加密后的文件
        File jFile = new File(parent, "jm" + name);
        //创建该文件的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        //创建该文件加密后的输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(jFile));
        System.out.println("请选择:1.加密   2.解密");
        int input = sc.nextInt();
        System.out.println("请输入一个长度为六的的密码");
        String sPwd = sc.next();
        while (sPwd.length() != 6) {
            System.out.println("密码长度不为六，请重新输入：");
            sPwd = sc.next();
        }
        char[] chars = sPwd.toCharArray();
        int len = 0;
        if (input == 1) {
            jiaMi(len, chars, bis, bos);
            System.out.println("加密成功");
        } else if (input == 2) {
            jieMi(len, chars, bis, bos);
            System.out.println("解密成功");
        }
        //关闭资源
        bis.close();
        bos.close();
        //删除源文件
        file.delete();
        jFile.renameTo(file);

    }

    private static void jieMi(int len, char[] chars, BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        /**
         * 解密
         */
        //进行读写和解密操作
        while ((len = bis.read()) != -1) {
            bos.write(len ^ chars[5] ^ chars[4] ^ chars[3] ^ chars[2] ^ chars[1] ^ chars[0]);
            //System.out.println(len^8);
        }

    }

    private static void jiaMi(int len, char[] chars, BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        /**
         * 加密
         */
        //进行读写和加密操作
        while ((len = bis.read()) != -1) {
            bos.write(len ^ chars[0] ^ chars[1] ^ chars[2] ^ chars[3] ^ chars[4] ^ chars[5]);
            //System.out.println(len ^ 8);
        }
    }

}
