package com.acompe.service;

import com.acompe.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return 所有用户
     */
    List<User> findAll();

    /**
     * 根据Id查询用户
     * @param id 查询需要的ID
     * @return   查询到的用户
     */
    User findById(@Param("id") Long id);

    /**
     * 根据Id删除用户
     * @param id 要删除的用户Id
     * @return   删除用户的数量
     */
    Integer deleteById(@Param("id") Long id);

    /**
     * 传入User，插入到数据库
     * @param user  要插入的用户
     * @return      插入用户的数量
     */
    Integer add(User user);


    /**
     * 根据用户Id更新用户信息
     * @param user  要更新的用户信息
     * @return      返回更新用户的数量
     */
    Integer update(User user);
}
