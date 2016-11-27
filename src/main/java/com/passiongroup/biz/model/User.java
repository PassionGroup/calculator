package com.passiongroup.biz.model;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class User {
    // TODO: 2016/11/24 石丰华，该类与UserInfo的唯一不同为gender 的类型为枚举。

    private String name;
    private Integer age ;

    public enum GenderEnums
    {   MAN(0, "男"),
        WOMAN(1, "女"),
        UNKNOWN(3, "不确定");

        private final Integer code;
        private final String description;

        GenderEnums(Integer code, String description) {
            this.code = code;
            this.description = description;
        }
    }

    private String email;
    private String password;

    public User(String name,  Integer age, String email, String password) {
        this.name = name;

        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() { return email;}

    public void setEmail(String email) { this.email = email;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;}

}
