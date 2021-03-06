package com.spring.action.chapter5;

import com.spring.action.chapter5.controller.HomeController;
import com.spring.action.chapter5.controller.HomeSpitterController;
import com.spring.action.chapter5.facade.SpitterRepository;
import com.spring.action.chapter5.model.Spitter;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import static org.junit.matchers.JUnitMatchers.hasItem;
import static org.junit.matchers.JUnitMatchers.hasItems;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.mockito.Mockito.*;

/**
 * 通过mock的方式测试界面结果
 * Created by Administrator on 2018/9/10.
 */
public class SpringMvcTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));
    }

    //显示最近登陆的20个用户
    @Test
    public void shouldShowRecentSpitters() throws Exception {
        List<Spitter> exectSpitters = createSpitters();
        //mock接口服务
        SpitterRepository mockSpitterRepository = mock(SpitterRepository.class);
        //当调用服务的时候返回 预期的结果
        when(mockSpitterRepository.findSpitters(Long.MAX_VALUE, 20)).thenReturn(exectSpitters);
        //获取控制器实例
        HomeSpitterController spitterController = new HomeSpitterController(mockSpitterRepository);
        //mock springMvc
        MockMvc mockMvc = standaloneSetup(spitterController).setSingleView(
                new InternalResourceView("/WEB-INFO/views/spitters.jsp")).build();
        //开始断言
        mockMvc.perform(get("/spitters"))
                //期待的视图名
                .andExpect(view().name("spitters"))
                //期待存在的属性
                .andExpect(model().attributeExists("spitterList"))
                //期待属性里面的值
                .andExpect(model().attribute("spitterList", hasItems(exectSpitters.toArray())));
    }

    //验证注册界面和显示用户界面
    @Test
    public void registerAndShowUserPage() throws Exception {
        SpitterRepository repository = mock(SpitterRepository.class);
        Spitter spitter = new Spitter(1L, "lijinpeng");
        when(repository.findSpitter("lijinpeng")).thenReturn(new Spitter(1L, "lijinpeng"));
        when(repository.saveSpitter(spitter)).thenReturn(spitter);
        when(repository.findSpitters(Long.MAX_VALUE, 20)).thenReturn(createSpitters());
        HomeSpitterController spitterController = new HomeSpitterController(repository);
        MockMvc mockMvc = standaloneSetup(spitterController).setSingleView(
                new InternalResourceView("/WEB-INFO/views/spitters.jsp")).build();
        //开始断言  获取表单  通过获取属性来感知表单是否获取成功
        mockMvc.perform(get("/spitters/register")).andExpect(
                view().name("registerForm")).andExpect(
                model().attribute("isSkip", hasItems(createSpitters().toArray()))
        );
        //提交表单   开始注册  重定向暂时有点问题
        mockMvc.perform(post("/spitters/register")
                .param("id", "1")
                .param("message", "lijinpeng")
        ).andExpect(redirectedUrl("/spitters/basic/lijinpeng"));
    }


    public List<Spitter> createSpitters() {
        List<Spitter> spitters = new ArrayList<Spitter>(20);
        for (int i = 0; i < 20; i++) {
            Spitter spitter = new Spitter("Spitter" + i, new Date());
            spitters.add(spitter);
        }
        return spitters;

    }
}
