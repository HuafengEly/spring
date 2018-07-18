package com.gree.www.dao;

import com.gree.www.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

    /**
     * 新增
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(User user) throws Exception;

    /**
     * 修改
     * @param user
     * @return
     * @throws Exception
     */
    public int updataUser(User user) throws Exception;

    /**
     * 删除
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteUser(int id) throws Exception;

    /**查询
     * select
     * @param id
     * @return
     * @throws Exception
     */
    public User selectUserById(int id) throws Exception;

    /**
     * 查询所有
     * @param
     * @return
     * @throws Exception
     */
    public List<User> selectAllUser() throws Exception;



}
