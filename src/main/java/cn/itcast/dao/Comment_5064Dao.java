package cn.itcast.dao;

import cn.itcast.domain.Comment_5064;

/**
 * @author chnuo
 * @create 2021-01-13  14:56
 */
public interface Comment_5064Dao {
    //根据账号查询评价
    String find(String Pno);

    //编写评价
    void setComment(Comment_5064 comment);
}
