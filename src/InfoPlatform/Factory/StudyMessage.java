package InfoPlatform.Factory;


//约学习的信息
public class StudyMessage extends Message{
    /**
     * 生成约学习的信息
     */

    //将信息的标志字段设为信息类名
    public StudyMessage(){
        type = "StudyMessage";
    }
    @Override
    public void showMessage() {
        System.out.println("This is a StudyMessage");
    }
}
