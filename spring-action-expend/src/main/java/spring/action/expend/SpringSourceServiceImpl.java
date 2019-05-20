package spring.action.expend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.action.expend.model.SpringSourceModel;

/**
 * Created by lijinpeng on 2019/5/20.
 */
@Service
public class SpringSourceServiceImpl {
    @Autowired
    private SpringSourceModel sourceModel;
}
