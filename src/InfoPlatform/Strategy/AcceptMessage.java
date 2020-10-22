package InfoPlatform.Strategy;

import InfoPlatform.Factory.Message;


/**
 * 接受邀约
 */
public class AcceptMessage implements MessageStrategy {


    @Override
    public void MessageOperation(Message message) {
        System.out.println(message.getType() + " is accepted");
    }
}
