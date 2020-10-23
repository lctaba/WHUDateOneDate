package InfoPlatform.Strategy;


import InfoPlatform.Factory.Message;
/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 策略模式，用于实现对信息的不同类型的操作
 */
public interface MessageStrategy {
    public void MessageOperation(Message message);
}
