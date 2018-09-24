package spring.action.chapter7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.action.chapter7.exception.DataServiceException;

/**
 * Created by Administrator on 2018/9/22.
 */
@Controller
@RequestMapping(value = "/chapter7/")
public class ExceptionController {

    @RequestMapping(value = "/exception1", method = RequestMethod.GET)
    public String dataService1(@ModelAttribute String author) throws DataServiceException {
        System.out.println("错误制定者:"+author);
        throw new DataServiceException("SYS_TIMEOUT", "服务超时");
    }
    @RequestMapping(value = "/exception2", method = RequestMethod.GET)
    public String dataService2() throws DataServiceException {
        throw new DataServiceException("SYS_TIMEOUT", "服务超时");
    }
//    //遇到这个错误直接返回对应的错误界面
//    @ExceptionHandler(value = {DataServiceException.class})
//    public String handleException() {
//        return "chapter7/timeOut";
//    }
}
