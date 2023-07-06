import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})//指定注解使用的位置（成员变量，类，方法）
@Retention(RetentionPolicy.RUNTIME)//指定该注解的存活时间
public @interface StudentUtil {
    String name() default "李四";
    int age() default 18;
}
