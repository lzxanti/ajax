package com.bjsxt.pojo;

/**
 * 作用：
 * <p>@author anti</p>
 * <p>QQ：1972401425</p>
 * <p>Date：2019/9/16 9:37 </p>
 * <p>Version：1.0</p>
 * <p>Description：</p>
 */
public class UserGson {
    private String name;
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

    public UserGson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserGson() {
    }

    public void setAge(int age) {
        this.age = age;
    }


}
