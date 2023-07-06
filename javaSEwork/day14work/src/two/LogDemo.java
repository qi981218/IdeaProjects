package two;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 18:42
 * @version: 1.0
 */
public class LogDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        //分别使用日志的debug, info, warn, error级别, 打印出"hello 日志!!! "
        LOGGER.debug("hello日志");
        LOGGER.info("hello日志");
        LOGGER.warn("hello日志");
        LOGGER.error("hello日志");
    }
}
