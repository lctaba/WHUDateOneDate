package InfoPlatform.Factory;

/**
 * @Author cyh
 * @Date 2020/10/17
 */

//信息工厂
public class MessageFactory {
    //三种不同的信息类型
    public enum MessageType{
        StudyMessage,
        JogMessage,
        MealMessage
    }

    //工厂通过不同参数生成不同类的信息对象
    public Message createMessage(MessageType messageType){
        switch(messageType){
            case StudyMessage:
                return new StudyMessage();
            case JogMessage:
                return new JogMessage();
            case MealMessage:
                return new MealMessage();
            default:
                throw new IllegalStateException("Unexpected value: " + messageType);
        }
    }
}
