package InfoPlatform.Service;


import InfoPlatform.Factory.Message;
import InfoPlatform.Factory.MessageFactory;
import InfoPlatform.Strategy.MessageContext;

public class UserMessage implements MessageService{



    /**
     *发布消息
     */
    @Override
    public void post(MessageFactory.MessageType messageType) {
        //运用工厂创建消息
        MessageFactory messageFactory = new MessageFactory();
        Message message = messageFactory.createMessage(messageType);
        /**
         * 与数据库交互的代码
         */
        //发布消息
        System.out.println("post a" + message.getType());
    }


    /**
     * 浏览消息
     */
    @Override
    public void browse() {
        /**
         * 与数据库交互的代码
         */
        System.out.println("you browse all the messages");
    }

    /**
     * 对消息进行操作
     * @param message  被执行的消息对象
     * @param operationType    执行方式
     */
    @Override
    public void MessageOperation(Message message, MessageContext.OperationType operationType) {
        MessageContext messageContext = new MessageContext();
        //执行对消息的操作
        messageContext.execute(message,operationType);
        /**
         * 与数据库交互的代码
         */
    }
}





