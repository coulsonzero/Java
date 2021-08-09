package test.java;

import main.java.com.kuang.dao.UserDaoImpl;
import main.java.com.kuang.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
