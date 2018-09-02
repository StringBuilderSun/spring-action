package spring.action.chapter4.exception;

/**
 * Created by Administrator on 2018/9/2.
 */
public class SpringAopException extends Exception {

    public SpringAopException(String message) {
        super(message);
        System.out.println("抛出了SpringAop异常！！！");
    }
}
