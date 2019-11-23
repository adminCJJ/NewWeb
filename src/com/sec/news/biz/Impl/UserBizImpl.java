package com.sec.news.biz.Impl;

import com.sec.news.biz.UserBiz;
import com.sec.news.dao.Impl.UserDaoImpl;
import com.sec.news.dao.UserDao;
import com.sec.news.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zdy
 * @site XXX
 * @company XXX公司
 * @create 2019-11-20-17:15
 */
public class UserBizImpl implements UserBiz{

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean adminLogin(User user) {
        return userDao.validateUser(user);
    }

    @Override
    public boolean updateUserInfo(User user) {
        return userDao.updateUser(user);
    }
}
