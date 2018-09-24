package spring.action.chapter7.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import spring.action.chapter7.exception.DataServiceException;

/**
 * Created by lijinpeng on 2018/9/24.
 */
//为所有控制器添加异常通知
@ControllerAdvice
public class ExceptionAdviceController {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}
    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "Li jinpeng");
    }

    /**
     * 全局异常捕捉处理
     * @return
     */
    @ExceptionHandler(value = {DataServiceException.class})
    public String timeOut() {
        return "chapter7/timeOut";
    }
}
