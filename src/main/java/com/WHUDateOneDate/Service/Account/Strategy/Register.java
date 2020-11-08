package com.WHUDateOneDate.Service.Account.Strategy;



/**
 * @Author cyh
 * @Date 2020/10/22
 */
import com.WHUDateOneDate.Domian.User;

public class Register implements UserStrategy{
    /**
     * 登录
     * @param name 用户名
     * @param password 密码
     */
    @Override
    public void userOperation(String name, String password) {
        User user = new User(name,password);
        /**
         * 数据库交互
         */
        System.out.println("register successfully");
    }
}
