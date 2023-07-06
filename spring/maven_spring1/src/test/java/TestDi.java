import com.di.A;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {

    @Test
    public void TestD() {
//加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_di.xml");
        A a = (A) applicationContext.getBean("a");
        a.method();
    }
}
