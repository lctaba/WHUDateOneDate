package com.WHUDateOneDate.Service.Account.Strategy;

/**
 * @Author cyh
 * @Date 2020/10/22
 */

/**
 * 策略模式实现用户的注册登录登出删除账户的操作
 */
public interface UserStrategy {
    public void userOperation(String name, String password);
}
