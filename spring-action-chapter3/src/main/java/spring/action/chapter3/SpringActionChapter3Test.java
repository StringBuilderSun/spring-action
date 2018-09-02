package spring.action.chapter3;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.action.chapter3.condaition.ConditionConfig;
import spring.action.chapter3.condaition.service.MagicServiceBean;
import spring.action.chapter3.environment.Bank;
import spring.action.chapter3.environment.ExpressConfig;
import spring.action.chapter3.environment.WebSite;
import spring.action.chapter3.profile.ProfileConfig;
import spring.action.chapter3.profile.service.ProfileService;

/**
 * Created by Administrator on 2018/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProfileConfig.class, ConditionConfig.class, ExpressConfig.class})
@ActiveProfiles(value = "test")
public class SpringActionChapter3Test {
    @Autowired
    private ProfileService profileService;
    @Autowired(required = false)
    private MagicServiceBean magicService;
    @Autowired
    private WebSite webSite;
//    @Autowired
//    private Bank bank;
    @Test
    public void profileTest() {
        profileService.mockService("hello World");
    }

    @Test
    public void conditionBeanTest() {
        if (magicService != null) {
            magicService.magicService("hello magic!");
        } else {
            System.out.println("不符合bean创建的条件！！");
        }
    }

    @Test
    public void enviromentTest() {
        System.out.println(webSite);
        //通过注解使用 还不太会
//        System.out.println(bank);
    }
}
