package cn.itcast.services;

import cn.itcast.Uilts.SqlUtil;
import cn.itcast.dao.User_pswd_5064Dao;
import cn.itcast.domain.User_pswd_5064;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author chnuo
 * @create 2021-01-13  19:20
 */
public class User_pswd_5064Service {
    public boolean login(String username,String password){
        SqlUtil sql = new SqlUtil();
        User_pswd_5064Dao mapper = (User_pswd_5064Dao) sql.getMapper(User_pswd_5064Dao.class);
        User_pswd_5064 user_pswd_5064 = mapper.find(username);
        if(user_pswd_5064.getPSWD().equals(password))
        {
            sql.close();
            return true;
        }
        else {
            sql.close();
            return false;
        }
    }

    public boolean regist(String username,String password){
        SqlUtil sql = new SqlUtil();
        User_pswd_5064Dao mapper = (User_pswd_5064Dao)sql.getMapper(User_pswd_5064Dao.class);
        User_pswd_5064 user_pswd_5064 = mapper.find(username);
        if(user_pswd_5064!=null) {
            sql.close();
            return false;
        }
        mapper.regist(new User_pswd_5064(username,password));
        sql.close();
        return true;
    }
}
