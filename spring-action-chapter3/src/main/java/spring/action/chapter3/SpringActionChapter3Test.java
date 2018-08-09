package spring.action.chapter3;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chapter3.condaition.ConditionConfig;
import spring.action.chapter3.condaition.service.MagicServiceBean;
import spring.action.chapter3.profile.ProfileConfig;
import spring.action.chapter3.profile.service.ProfileService;

/**
 * Created by Administrator on 2018/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProfileConfig.class,ConditionConfig.class})
@ActiveProfiles(value = "test")
public class SpringActionChapter3Test {
    @Autowired
    private ProfileService profileService;
    @Autowired(required = false)
    private MagicServiceBean magicService;
    @Test
    public void profileTest()
    {
     profileService.mockService("hello World");
    }
    @Test
    public void conditionBeanTest()
    {
        if(magicService!=null)
        {
            magicService.magicService("hello magic!");
        }else
        {
            System.out.println("环境变量中magic属性不存在！！");
        }
    }
}
