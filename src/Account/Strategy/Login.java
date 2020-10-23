package Account.Strategy;


/**
 * @Author cyh
 * @Date 2020/10/22
 */
public class Login implements UserStrategy{
    /**
     * 登录
     * @param name 用户名
     * @param password 密码
     */
    @Override
    public void userOperation(String name, String password) {
        /**
         * 数据库交互
         */
        System.out.println(name + " logs in successfully");
    }
}
