package com.WHUDateOneDate.Domian;


/**
 * @Author cyh
 * @Date 2020/10/17
 */
public class User {
    public User(String name, String password){
        this.name = name;
        this.password = password;
        System.out.println("new user is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    String name;
    String password;

}

