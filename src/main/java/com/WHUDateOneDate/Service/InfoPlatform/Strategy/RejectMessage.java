package com.WHUDateOneDate.Service.InfoPlatform.Strategy;

import com.WHUDateOneDate.Service.InfoPlatform.Factory.Message;
/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 拒绝信息
 */
public class RejectMessage implements MessageStrategy {

    @Override
    public void MessageOperation() {
        System.out.println("message is rejected");
    }
}
