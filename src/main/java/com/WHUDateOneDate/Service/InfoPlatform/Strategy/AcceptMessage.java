package com.WHUDateOneDate.Service.InfoPlatform.Strategy;

import com.WHUDateOneDate.Service.InfoPlatform.Observer.AppointmentInfo;
import com.WHUDateOneDate.Service.InfoPlatform.Observer.UserAppointment;
/**
 * @Author cyh
 * @Date 2020/10/17
 */

/**
 * 接受邀约
 */
public class AcceptMessage implements MessageStrategy {


    @Override
    public void MessageOperation() {
        //已经存在的观察者对象
        AppointmentInfo appointmentInfo = new AppointmentInfo();
        System.out.println("there is already a subject");
        //创建观察者对象
        UserAppointment userAppointment = new UserAppointment();
        System.out.println("a observer has been created");
        //将用户加入观察者列表
        appointmentInfo.registerObserver(userAppointment);
        appointmentInfo.setMemberNumber(appointmentInfo.getMemberNumber()+1);
        //通知观察者对象
        appointmentInfo.notifyObserver();
        System.out.println("a message is accepted");
    }
}
