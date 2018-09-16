package sping.action.chapter6.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2018/9/16.
 */
@Setter
@Getter
@ToString
public class UserInfo {
    @NotNull
    @Size(max = 8)
    private String firstName;
    @NotNull
    @Size(max = 12)
    private String lastName;
    @NotNull
    @Size(min = 8, max = 20)
    private String userName;
    private String email;
    @NotNull
    @Size(min = 8, max = 16)
    //可以包含数字、字母、下划线，并且要同时含有数字和字母，且长度要在8-16位之间。
//    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z_]{8,16}$")
    private String passWord;
}
