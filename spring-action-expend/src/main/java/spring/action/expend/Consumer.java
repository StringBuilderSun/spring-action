package spring.action.expend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by lijinpeng on 2019/5/25.
 */
@Setter
@Getter
@Service
@ToString
public class Consumer {

    private List<String> adress;

    @PostConstruct
    public  void init()
    {
        System.out.println(adress);
    }


}
