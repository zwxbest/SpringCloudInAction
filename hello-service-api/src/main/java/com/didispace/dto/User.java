package com.didispace.dto;

import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2016/9/16.
 */
public class User {

    @NotNull(message = "不能为空")
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @NotNull(message = "不能为空")
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

    @Override
    public String toString() {
        return "name=" + name + ", age=" +age;
    }

}
