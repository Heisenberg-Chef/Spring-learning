package com.qi.Service;

import com.qi.Dao.UserDao;
import com.qi.Dao.UserDaoImpl;

public class UserServiceImpl implements UserSerivce{
    // 引用组合,多态.
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
