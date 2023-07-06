package properties;

import java.io.*;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 18:47
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        > 请定义Student类，有以下属性：姓名、性别、年龄，并实现Serializable接口。
//> 请定义main()方法，创建一个Student对象：
//> ​       Student stu = new Student(“迪丽热巴”,”女”,18);
//> 要求: 将stu序列化到文件“秘密.txt”中
//#### 4.2 题目二
//                > 将文件”秘密.txt”中的对象读去出来, 并打印此对象

        //实例化student对象
        Student stu = new Student("迪丽热巴","女",18);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("秘密.txt"));
        oos.writeObject(stu);
        oos.close();
        //将文件”秘密.txt”中的对象读去出来, 并打印此对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("秘密.txt"));
        Student o = (Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
