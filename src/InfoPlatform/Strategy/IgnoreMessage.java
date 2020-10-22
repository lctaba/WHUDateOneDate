package InfoPlatform.Strategy;

import InfoPlatform.Factory.Message;


/**
 * 忽略信息
 */
public class IgnoreMessage implements MessageStrategy{
    @Override
    public void MessageOperation(Message message) {
        System.out.println(message.getType() + " is ignored");
    }
}
