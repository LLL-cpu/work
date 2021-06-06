package cn.itcast.dao;

import cn.itcast.domain.State_5064;

import java.util.List;

/**
 * @author chnuo
 * @create 2021-01-13  15:13
 */
public interface State_5064Dao {
    //查询所有员工的状态
    List<State_5064> findAll();

    //更新员工的状态
    void update(State_5064 state);

    //更新所有员工状态
    void updateAll();
}
