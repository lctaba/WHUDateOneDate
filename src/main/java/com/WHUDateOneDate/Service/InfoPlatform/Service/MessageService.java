package com.WHUDateOneDate.Service.InfoPlatform.Service;

import com.WHUDateOneDate.Service.InfoPlatform.Factory.Message;
import com.WHUDateOneDate.Service.InfoPlatform.Factory.MessageFactory;
import com.WHUDateOneDate.Service.InfoPlatform.Strategy.MessageContext;
/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 封装了发布信息，浏览信息，以及信息操作三个方法
 * 信息操作包括同意，拒绝，忽略，利用策略模式实现
 */
public interface MessageService {
    public void post(MessageFactory.MessageType messageType,String messageContent);
    public void browse();
    public void MessageOperation(MessageContext.OperationType operationType);
}
