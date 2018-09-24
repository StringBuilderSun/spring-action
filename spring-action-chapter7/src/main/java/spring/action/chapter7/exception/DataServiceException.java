package spring.action.chapter7.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Administrator on 2018/9/22.
 */
@Getter
//表示controller中如果抛出这个异常 自动转换为http 这个错误码  和错误描述
@ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "服务请求失败")
public class DataServiceException extends Exception {
    private String errorCode;
    private String errorMessage;

    public DataServiceException(String errorCode, String errorDesc) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorDesc;
    }
}
