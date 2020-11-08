package com.WHUDateOneDate.Service.InfoPlatform.Strategy;

import com.WHUDateOneDate.Service.InfoPlatform.Factory.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author cyh
 * @Date 2020/10/17
 */
@Service
public class MessageContext {
    private MessageStrategy messageStrategy;

    //三种不同的信息操作
    public enum OperationType{
        Reject,Accept,Ignore
    }

    //执行策略
    public void execute(OperationType operationType){
        switch (operationType){
            case Accept:
                this.messageStrategy = new AcceptMessage();
                break;
            case Reject:
                this.messageStrategy = new RejectMessage();
                break;
            case Ignore:
                this.messageStrategy = new IgnoreMessage();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operationType);
        }
        messageStrategy.MessageOperation();
    }
}
