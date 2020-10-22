package InfoPlatform.Strategy;

import InfoPlatform.Factory.Message;

public class MessageContext {
    private MessageStrategy messageStrategy;

    //三种不同的信息操作
    public enum OperationType{
        Reject,Accept,Ignore
    }

    //执行策略
    public void execute(Message message, OperationType operationType){
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
        messageStrategy.MessageOperation(message);
    }
}
