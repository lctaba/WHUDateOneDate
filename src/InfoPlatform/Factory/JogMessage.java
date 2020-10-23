package InfoPlatform.Factory;

/**
 * @Author cyh
 * @Date 2020/10/17
 */

//约跑步的信息
public class JogMessage extends Message{

    /**
     * 生成约跑步的信息
     */

    //将信息的标志字段设为信息类名
    public JogMessage(){
        type = "JogMessage";
    }


    @Override
    public void showMessage() {
        System.out.println("This is a JogMessage");
    }
}
