package com.WHUDateOneDate.Service.InfoPlatform.Service;


import com.WHUDateOneDate.Service.InfoPlatform.Factory.Message;
import com.WHUDateOneDate.Service.InfoPlatform.Factory.MessageFactory;
import com.WHUDateOneDate.Service.InfoPlatform.Observer.AppointmentInfo;
import com.WHUDateOneDate.Service.InfoPlatform.Observer.UserAppointment;
import com.WHUDateOneDate.Service.InfoPlatform.Strategy.MessageContext;
import org.springframework.stereotype.Service;


/**
 * @Author cyh
 * @Date 2020/10/17
 */

@Service
public class UserMessageService implements MessageService{


    /**
     *发布消息
     */
    @Override
    public void post(MessageFactory.MessageType messageType,String messageContent) {
        //运用工厂创建消息
        MessageFactory messageFactory = new MessageFactory();
        Message message = messageFactory.createMessage(messageType,messageContent);
        /**
         * 与数据库交互的代码
         */
        //发布消息
        System.out.println("post a" + message.getType());
        //创建观察者对象
        UserAppointment userAppointment = new UserAppointment();
        System.out.println("a observer has been created");
        //创建被观察对象
        AppointmentInfo appointmentInfo = new AppointmentInfo();
        System.out.println("a subject has been created");
        //将用户加入观察者列表
        appointmentInfo.registerObserver(userAppointment);
        appointmentInfo.setMemberNumber(appointmentInfo.getMemberNumber()+1);
        //通知观察者对象
        appointmentInfo.notifyObserver();
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
     * @param operationType    执行方式
     */
    @Override
    public void MessageOperation(MessageContext.OperationType operationType) {
        MessageContext messageContext = new MessageContext();
        //执行对消息的操作
        messageContext.execute(operationType);
        /**
         * 与数据库交互的代码
         */
    }
}





