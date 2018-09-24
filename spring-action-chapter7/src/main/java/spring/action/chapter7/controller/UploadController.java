package spring.action.chapter7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import spring.action.chapter7.exception.DataServiceException;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/9/21.
 */
@Controller
@RequestMapping(value = "/chapter7/")
public class UploadController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "chapter7/upload";
    }

    //使用MultipartFile接收
    @RequestMapping(value = "/upload1", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam(value = "file") MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String contetType = file.getContentType();
        Long size = file.getSize();
        file.transferTo(new File("d:/images/" + fileName));
        System.out.println("fileName:" + fileName + " contextType:" + contetType + " size:" + size);
        return "success";
    }
    //使用Part接收
    @RequestMapping(value = "/upload2", method = RequestMethod.POST)
    @ResponseBody
    public String upload2(@RequestParam(value = "file") Part file) throws IOException {
        String fileName = file.getSubmittedFileName();
        String contetType = file.getContentType();
        Long size = file.getSize();
        file.write("d:/images/" + fileName);
        System.out.println("fileName:" + fileName + " contextType:" + contetType + " size:" + size);
        return "success";
    }
    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String dataService() throws DataServiceException {
        throw new DataServiceException("SYS_TIMEOUT", "服务超时");
    }
}
