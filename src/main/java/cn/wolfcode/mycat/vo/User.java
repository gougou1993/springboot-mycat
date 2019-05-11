package cn.wolfcode.mycat.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * User
 */
public class User {

    private Long  id;
    private String name;
    private String password;

    @NotNull(message = "{}")
    @Email(message = "{}")
    private String email;
    private String phone;
}