package InfoPlatform.Factory;


//具体类：约饭的信息
public class MealMessage extends Message{

    /**
     * 生成约饭的信息
     */

    //将信息的标志字段设为信息类名
    public MealMessage(){
        type = "MealMessage";
    }
    @Override
    public void showMessage() {
        System.out.println("This is a MealMessage");
    }
}
