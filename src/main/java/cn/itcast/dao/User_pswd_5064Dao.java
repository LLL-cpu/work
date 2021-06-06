package cn.itcast.dao;

import cn.itcast.domain.User_pswd_5064;

import java.util.List;

/**
 * @author chnuo
 * @create 2021-01-13  10:12
 */
public interface User_pswd_5064Dao {
    //根据账号查询密码，并返回user_pswd_5064对象
    User_pswd_5064 find(String username);

    //注册账号
    void regist(User_pswd_5064 user);

    //删除账号
    void delete(String username);
}
