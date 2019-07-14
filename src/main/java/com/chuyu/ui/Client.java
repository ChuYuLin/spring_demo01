package com.chuyu.ui;

import com.chuyu.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args){
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.saveUser();
    }
}
