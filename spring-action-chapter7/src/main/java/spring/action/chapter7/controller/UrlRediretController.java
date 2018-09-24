package spring.action.chapter7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spring.action.chapter7.model.Chapter7;

/**
 * Created by lijinpeng on 2018/9/24.
 */
@Controller
@RequestMapping(value = "/chapter7/")
public class UrlRediretController {
    @RequestMapping(value = "/addChapter", method = RequestMethod.GET)
    public String showForm() {
        return "chapter7/showForm";
    }

    //方式1  2
    //chapterName 会自动填充到URL模板占位符上
    //可以设置多个参数 模板不变，会自动添加需要得数据 /chapter7/chapterInfo/章节7?author=lijinpeng
    @RequestMapping(value = "/addChapter1", method = RequestMethod.POST)
    public String handleForm1(Chapter7 chapter, Model model) {
        model.addAttribute("chapterName", chapter.getChapterName());
        model.addAttribute("author", chapter.getAuthor());
        return "redirect:/chapter7/chapterInfo/{chapterName}";
    }

    //方式3   使用RedirectAttributes特性
    @RequestMapping(value = "/addChapter2", method = RequestMethod.POST)
    public String handleForm2(Chapter7 chapter, RedirectAttributes model) {
        model.addFlashAttribute("chapter", chapter);
        return "redirect:/chapter7/chapterInfo";
    }

    //方式1重定向
    @RequestMapping(value = "/chapterInfo/{chapterName}")
    public String chapterInfo1(@PathVariable String chapterName, String author, Model model) {
        model.addAttribute("chapterName", chapterName);
        model.addAttribute("author", author);
        return "chapter7/chapterInfo";
    }

    //方式2重定向
    @RequestMapping(value = "/chapterInfo")
    public String chapterInfo2(Chapter7 chapter, Model model) {
        model.addAttribute("chapter", chapter);
        return "chapter7/chapterInfo";
    }
}