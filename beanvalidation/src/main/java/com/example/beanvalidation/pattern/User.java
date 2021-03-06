package com.example.beanvalidation.pattern;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class User {

    @NotNull
    private String name;

    @Min(19)
    private int age;

    @Pattern(regexp="^[0-9]\\d{2}-(\\d{3}|\\d{4})-\\d{4}$", message="전화번호 형식이 아닙니다.")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", phone=" + phone + "]";
    }
}