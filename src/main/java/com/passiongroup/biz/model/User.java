package com.passiongroup.biz.model;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class User {
    private String name;
    private Integer age ;
    private GenderEnum gender;
    private String email;
    private String password;
    private String message;

    public User() {
    }

    public User(String name, Integer age, String email, String password,String message) {
        this.name = name;
        this.message=message;
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
        this.password = password;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) { this.gender = gender; }

    public String getMessage() {return message;}


}
