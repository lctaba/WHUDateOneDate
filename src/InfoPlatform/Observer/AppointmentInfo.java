package InfoPlatform.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cyh
 * @Date 2020/10/22
 */


/**
 * 被观察的类，邀约的信息
 * 其中有观察者列表
 * 以及一个int类型memberNumber用于记录此邀约中的人数
 */
public class AppointmentInfo implements Subject{
    //该邀约中的人数
    private int memberNumber;
    //观察者列表
    private List<Observer> observers;

    public AppointmentInfo(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //通知观察者时更新观察者列表中的对象
    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(memberNumber));
    }


    public int getMemberNumber() {
        return memberNumber;
    }

    //在memberNumber变化时通知所有观察者
    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
        notifyObserver();
    }
}
