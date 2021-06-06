package cn.itcast.dao;

import cn.itcast.domain.Personnel_5064;

/**
 * @author chnuo
 * @create 2021-01-13  15:07
 */
public interface Personnel_5064Dao {
    //根据工号查询员工基本信息
    Personnel_5064 find(String Pno);

    //更新员工基本信息
    void update(Personnel_5064 user);

    //辞退员工
    void delete(String Pno);
}
