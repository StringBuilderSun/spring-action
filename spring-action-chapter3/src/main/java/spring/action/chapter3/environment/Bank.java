package spring.action.chapter3.environment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;


/**
 * Created by Administrator on 2018/8/30.
 */
@Getter
@Setter
public class Bank {
    @Value("${bank.name}")
    private String bankName;
    @Value("${bank.id}")
    private String bankId;
    @Value("${bank.adress}")
    private String bankAdress;
    @Value("${bank.age}")
    private Integer bankAge;

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankId='" + bankId + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                ", bankAge=" + bankAge +
                '}';
    }
}
