package com.WHUDateOneDate.Service.InfoPlatform.Observer;


/**
 * @Author cyh
 * @Date 2020/10/22
 */


public class UserAppointment implements Observer {


    private int memberNumber;
    @Override
    public void update(int memberNumber) {
        if (this.memberNumber < memberNumber) {
            System.out.println("This appointment has a new member. Now we have " + memberNumber + " in this appointment");
        }
        if (this.memberNumber > memberNumber){
            System.out.println("A member leaves. Now we have " + memberNumber + " in this appointment");
        }
        this.memberNumber = memberNumber;
    }
}
