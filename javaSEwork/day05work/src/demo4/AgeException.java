package demo4;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  18:56
 * @Version: 1.0
 */
public class AgeException extends RuntimeException {
    //无参
    public AgeException() {
    }

    //有参
    public AgeException(String message) {
        super(message);
    }
}
