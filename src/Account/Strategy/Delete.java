package Account.Strategy;


/**
 * @Author cyh
 * @Date 2020/10/22
 */
public class Delete implements UserStrategy{
    /**
     * 删除账户
     * @param name 用户名
     * @param password 密码
     */
    @Override
    public void userOperation(String name, String password) {
        /**
         * 数据库交互
         */
        System.out.println(name + " is deleted");
    }
}
