package com.gree.www.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.io.Reader;

public class MybatisTools {

    public static SqlSessionFactory sessionFactory;
    public static String resource = "mybatis-config.xml";

    static{
        try{
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static SqlSession getSession(){
        return sessionFactory.openSession();
    }

}
