package InfoPlatform.Strategy;

import InfoPlatform.Factory.Message;
/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 接受邀约
 */
public class AcceptMessage implements MessageStrategy {


    @Override
    public void MessageOperation(Message message) {
        System.out.println(message.getType() + " is accepted");
    }
}
