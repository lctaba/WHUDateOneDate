//import WHUDateOneDate.Account.Strategy.UserContext;
//import WHUDateOneDate.InfoPlatform.Factory.MealMessage;
//import WHUDateOneDate.InfoPlatform.Factory.MessageFactory;
//import WHUDateOneDate.InfoPlatform.Observer.AppointmentInfo;
//import WHUDateOneDate.InfoPlatform.Observer.UserAppointment;
//import WHUDateOneDate.InfoPlatform.Service.UserMessage;
//import WHUDateOneDate.InfoPlatform.Strategy.MessageContext;
//
//public class WHUDateOneDate {
//    public static void main(String[] args) {
//        /**
//         * 利用策略模式
//         * 登录与注册
//         */
//        UserContext userContext = new UserContext();
//        userContext.execute("cyh","pwd", UserContext.UserOperation.Register);
//        userContext.execute("cyh","pwd", UserContext.UserOperation.Login);
//        userContext.execute("cjc","pwd", UserContext.UserOperation.Register);
//        userContext.execute("cjc","pwd", UserContext.UserOperation.Login);
//        userContext.execute("wzx","pwd", UserContext.UserOperation.Register);
//        userContext.execute("wzx","pwd", UserContext.UserOperation.Login);
//
//
//        UserMessage userMessage = new UserMessage();
//
//        /**
//         * 发布约饭信息
//         *利用工厂模式生成信息对象
//         */
//        userMessage.post(MessageFactory.MessageType.MealMessage);
//
//        /**
//         * 利用观察者模式
//         *生成观察者对象
//         */
//        UserAppointment userAppointmentOne = new UserAppointment();
//
//
//
//        /**
//         * 生成邀约信息，是被观察者
//         */
//
//        AppointmentInfo appointmentInfo = new AppointmentInfo();
//
//        /**
//         * 将观察者加入列表中
//         */
//        appointmentInfo.setMemberNumber(appointmentInfo.getMemberNumber()+1);
//        appointmentInfo.registerObserver(userAppointmentOne);
//
//        /**
//         * 浏览信息
//         */
//        userMessage.browse();
//
//        /**
//         * 利用策略模式对信息进行处理
//         * 接受信息中的约饭邀请
//         */
//        userMessage.MessageOperation(new MealMessage(), MessageContext.OperationType.Accept);
//
//        /**
//         *再生成两个观察者对象
//         */
//        //生成观察者对象
//        UserAppointment userAppointmentTwo = new UserAppointment();
//        //通知其他观察者成员加1
//        appointmentInfo.setMemberNumber(appointmentInfo.getMemberNumber()+1);
//        //将新观察者加入观察者列表中
//        appointmentInfo.registerObserver(userAppointmentTwo);
//        //生成观察者对象
//        UserAppointment userAppointmentThree = new UserAppointment();
//        //通知其他观察者成员加1
//        //此时观察者列表中有两个成员，于是输出两次"This appointment has a new member. Now we have " + memberNumber + " in this appointment"
//        appointmentInfo.setMemberNumber(appointmentInfo.getMemberNumber()+1);
//        //将新观察者加入观察者列表中
//        appointmentInfo.registerObserver(userAppointmentThree);
//        //如果有人中途退出,例如第三个人
//        //将其从观察者列表移除
//        appointmentInfo.removeObserver(userAppointmentThree);
//        //通知其他观察者
//        //此时观察者列表中有两个成员，于是输出两次"A member leaves. Now we have " + memberNumber + " in this appointment"
//        appointmentInfo.setMemberNumber(appointmentInfo.getMemberNumber()-1);
//
//        /**发布跑步信息
//         *利用工厂模式生成信息对象
//         */
//        userMessage.post(MessageFactory.MessageType.JogMessage);
//
//        /**
//         * 利用策略模式对信息进行处理
//         * 拒绝信息中的跑步邀请
//         */
//        userMessage.MessageOperation(new MealMessage(), MessageContext.OperationType.Reject);
//
//        /**
//        * 退出登录
//        */
//        userContext.execute("cyh","pwd", UserContext.UserOperation.Logout);
//        userContext.execute("cjc","pwd", UserContext.UserOperation.Logout);
//        userContext.execute("wzx","pwd", UserContext.UserOperation.Logout);
//    }
//}
