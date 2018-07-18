package com.gree.www.service;

import com.gree.www.dao.UserMapper;
import com.gree.www.entity.User;
import com.gree.www.util.MybatisTools;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService {

    @Resource
    public UserMapper userDao;

    public User selectUser(int id)throws Exception{
//        SqlSession session= MybatisTools.getSession();
//        UserMapper userDao = session.getMapper(UserMapper.class);
        User user = userDao.selectUserById(id);
        System.out.println("[spring!]:UserService succeed!");
        return user;
    }

//    public static void main(String args[])throws Exception{
//        UserService userService = new UserService();
//        User user = (User) userService.selectUser(1);
//        System.out.println("[spring!]:UserServiceMain succeed!");
//        System.out.println(user.toString());
//    }

}
