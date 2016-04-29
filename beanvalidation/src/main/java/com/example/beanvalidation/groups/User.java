package com.example.beanvalidation.groups;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {

    @NotNull(groups = GroupsInterface.Insert.class)
    private String name;

    @Min(value = 1, groups = {GroupsInterface.Insert.class, GroupsInterface.Update.class})
    private int age;

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

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}