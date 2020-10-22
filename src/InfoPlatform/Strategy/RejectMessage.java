package InfoPlatform.Strategy;

import InfoPlatform.Factory.Message;

/**
 * 拒绝信息
 */
public class RejectMessage implements MessageStrategy {

    @Override
    public void MessageOperation(Message message) {
        System.out.println(message.getType() + " is rejected");
    }
}
