package com.ruoyi.auth.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户登录对象
 *
 * @author ruoyi
 */
@Getter
@Setter
@ToString
public class LoginBody {
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;
}
