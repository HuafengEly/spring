package com.gree.www.util;

import com.gree.www.dao.UserMapper;
import com.gree.www.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MybatisTest {

    public static void main(String[] args){
        insertUser();
        selectUser();
        updataUser();
        deleteUser();
        selectAllUser();
    }

    private static void updataUser() {
        SqlSession session = MybatisTools.getSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(2);
        user.setUsername("updatauser");
        user.setPassword("123456");
        try{
            userDao.updataUser(user);
            System.out.println(user.toString());
            session.commit();
        }catch(Exception e){
            System.out.println("[spring]:MybatisTest updataUser error!");
            e.printStackTrace();
            session.rollback();
        }
    }

    private static void selectAllUser() {
        SqlSession session = MybatisTools.getSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        try{
            List<User> user = userDao.selectAllUser();
            System.out.println(user.toString());
            session.commit();
        }catch (Exception e){
            System.out.println("[spring]:MybatisTest selectAllUser error!");
            e.printStackTrace();
            session.rollback();
        }


    }

    private static void insertUser() {
        SqlSession session = MybatisTools.getSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        User user = new User();
//        user.setId(10);
        user.setUsername("newuser");
        user.setPassword("123456");
        try{
            userDao.insertUser(user);
            System.out.println(user.toString());
            session.commit();
        }catch(Exception e){
            System.out.println("[spring]:MybatisTest insertUser error!");
            e.printStackTrace();
            session.rollback();
        }
    }

    private static void deleteUser() {
        SqlSession session = MybatisTools.getSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        try{
            userDao.deleteUser(3);
            session.commit();
        }catch(Exception e){
            System.out.println("[spring]:MybatisTest deleteUser error!");
            e.printStackTrace();
            session.rollback();
        }
    }

    public static void selectUser(){
        SqlSession session=MybatisTools.getSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        try{
            User user = userDao.selectUserById(1);
            System.out.println(user.toString());
            session.close();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }
    }

}
