package main.java.com.kuang.service;

import main.java.com.kuang.dao.UserDao;

/**
 * @author CoulsonZero
 * @version 2021-05-20 13:26
 */
public class UserServiceImpl implements UserService {
//    1.原先调用接口的方法：(缺点：用户需求会改变原来的代码)
//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UesrDaoMysqlImpl();


    // 2.set接口的思想：(已经发生了革命性变化，变被动为主动！不用再去管理对象的创建了，系统耦合性大大降低，可以更加专注于业务上，这是IOC的原型)
//    控制反转：主动创建对象->被动接受对象
//    无需手动修改实例用户，只需接受新对象即可

    //利用set进行动态实现值的注入！
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void getUser() {
        userDao.getUser();
    }
}
