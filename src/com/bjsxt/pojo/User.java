package com.bjsxt.pojo;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 9:37 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "{name:" + name + ",age:" + age + "}";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
