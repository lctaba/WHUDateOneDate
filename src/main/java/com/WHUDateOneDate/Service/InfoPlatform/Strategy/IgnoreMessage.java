package com.WHUDateOneDate.Service.InfoPlatform.Strategy;

import com.WHUDateOneDate.Service.InfoPlatform.Factory.Message;
/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 忽略信息
 */
public class IgnoreMessage implements MessageStrategy{
    @Override
    public void MessageOperation() {
        System.out.println("message is ignored");
    }
}
