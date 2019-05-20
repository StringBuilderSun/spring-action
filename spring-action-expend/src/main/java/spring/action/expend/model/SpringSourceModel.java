package spring.action.expend.model;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by lijinpeng on 2019/5/20.
 */
@Service
@ToString
public class SpringSourceModel {
    @Value("lijinpeng")
    private String name;
}
