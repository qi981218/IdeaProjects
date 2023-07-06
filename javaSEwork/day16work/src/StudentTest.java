import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 陈亚琪
 * @date 2022年07月29日 18:52
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //使用反射获取Student的class文件
        Class<?> clazz = Class.forName("Student");
        //创建对象
        Student student = (Student) clazz.newInstance();
        //通过反射获取这个类里面的方法并遍历
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(StudentUtil.class)){
                method.invoke(student,"李四",15);
            }
        }

    }
}
