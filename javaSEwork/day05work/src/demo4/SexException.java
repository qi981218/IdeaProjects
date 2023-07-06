package demo4;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  19:07
 * @Version: 1.0
 */
public class SexException extends RuntimeException {
    //无参
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }
}
