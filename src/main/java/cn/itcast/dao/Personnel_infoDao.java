package cn.itcast.dao;

import cn.itcast.domain.Personnel_info;

import java.util.List;

/**
 * @author chnuo
 * @create 2021-01-13  15:05
 */
public interface Personnel_infoDao {
    //查找所有人的详细信息
    List<Personnel_info> findAll();

    //根据工号查找详细信息
    Personnel_info find(String Pno);
}
