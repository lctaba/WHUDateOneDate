package com.WHUDateOneDate.Service.InfoPlatform.Factory;

/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 工厂模式
 * 信息的抽象类
 */

public abstract class Message {
    String type;
    String content;

    public String getContent() {
        return content;
    }

    //获取信息的种类
    public String getType() {
        return type;
    }

    public Message(){
        type = "null";
        content = "null";
    }

    //抽象方法
    public abstract void showMessage();
}
