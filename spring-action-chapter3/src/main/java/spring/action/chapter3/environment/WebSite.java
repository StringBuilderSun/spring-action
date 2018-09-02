package spring.action.chapter3.environment;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2018/8/30.
 */
@Getter
@Setter
public class WebSite {
    private String url;
    private Integer prot;
    private String name;
    private String password;

    public WebSite(String url, Integer prot, String name, String password) {
        this.url = url;
        this.prot = prot;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "url='" + url + '\'' +
                ", prot='" + prot + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
