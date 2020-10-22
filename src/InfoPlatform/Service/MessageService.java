package InfoPlatform.Service;

import InfoPlatform.Factory.Message;
import InfoPlatform.Factory.MessageFactory;
import InfoPlatform.Strategy.MessageContext;


/**
 * 封装了发布信息，浏览信息，以及信息操作三个方法
 * 信息操作包括同意，拒绝，忽略，利用策略模式实现
 */
public interface MessageService {
    public void post(MessageFactory.MessageType messageType);
    public void browse();
    public void MessageOperation(Message message, MessageContext.OperationType operationType);
}
