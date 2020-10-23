package InfoPlatform.Observer;

/**
 * @Author cyh
 * @Date 2020/10/22
 */


//被观察者
public interface Subject {
    //注册观察者
    public void registerObserver(Observer observer);
    //移除观察者
    public void removeObserver(Observer observer);
    //通知其他观察者
    public void notifyObserver();
}
